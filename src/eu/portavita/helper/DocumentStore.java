package eu.portavita.helper;

import java.util.Random;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class DocumentStore {

public static DocumentStore instance;

	private static final String KEY = "xml-presentation:documents";

	private final static Random random = new Random();

	public static DocumentStore getInstance() {
		if (instance == null) {
			instance = new DocumentStore();
		}
		return instance;
	}

	private Jedis getRedis() {
		return new Jedis("localhost");
	}

	public String get(int id) {
		final Jedis redis = getRedis();
		final String document = redis.hget(KEY, Integer.toString(id));
		redis.disconnect();
		return document;
	}

	public Set<String> list() {
		final Jedis redis = getRedis();
		final Set<String> ids = redis.hkeys(KEY);
		redis.disconnect();
		return ids;
	}

	public int put(String document) {
		final Jedis redis = getRedis();
		final int id = random.nextInt(10000);
		redis.hset(KEY, Integer.toString(id), document);
		redis.expire(KEY, 3600);
		redis.disconnect();
		return id;
	}
}
