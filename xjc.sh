#!/bin/bash
cp prepared/bindings.xml bindings.xml
rm -rf src/eu/portavita/sample
xjc -d src -b bindings.xml -no-header -extension $@ sample.xsd
cp prepared/jaxb.properties src/eu/portavita/sample/
rm bindings.xml
