<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet
	version="1.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:sam="http://portavita.eu/sample">

	<!-- Output as HTML -->
	<xsl:output
		indent="yes"
		method="html"
		omit-xml-declaration="yes" />

	<!-- Template matching root element -->
	<xsl:template match="/">

		<!-- HTML Head -->
		<head>
			<link
				rel="stylesheet"
				type="text/css"
				href="sample.css" />
		</head>

		<!-- HTML Body -->
		<body>
			<h1>Observations</h1>
			<table>

				<!-- Loop over observations -->
				<xsl:for-each select="//sam:observation">
					<xsl:call-template name="ObservationRow" />
				</xsl:for-each>

			</table>
		</body>
	</xsl:template>

	<!-- Template to render a single observation -->
	<xsl:template name="ObservationRow">
		<tr>

			<!-- Observation name -->
			<td>
				<xsl:value-of select="sam:code/@displayName" />
			</td>

			<!-- Observation value -->
			<td>
				<xsl:choose>

					<!-- Coded value -->
					<xsl:when test="sam:value/@displayName">
						<xsl:value-of select="sam:value/@displayName" />
					</xsl:when>

					<!-- Physical quantity -->
					<xsl:when test="sam:value/@value">
						<xsl:value-of select="sam:value/@value" />
						<xsl:text> </xsl:text>
						<xsl:value-of select="sam:value/@unit" />
					</xsl:when>
				</xsl:choose>
			</td>
		</tr>
	</xsl:template>

</xsl:stylesheet>