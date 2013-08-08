grails.servlet.version = "2.5"
grails.project.work.dir = "target"
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.source.level = 1.6
grails.project.target.level = 1.6

grails.project.dependency.resolution = {
	inherits "global"
	log "warn"
	checksums true

	repositories {
		inherits true
		
		grailsPlugins()
		grailsHome()
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	dependencies {
		
	}

	plugins {
		compile ":hibernate:$grailsVersion"
		compile ":jquery:1.8.3"
		compile ":resources:1.2"
		//compile ":lesscss-resources:1.3.3"
		runtime ":twitter-bootstrap:2.3.2"
		runtime ":fields:1.3"
		runtime ":cache-headers:1.1.5"
		runtime ":cached-resources:1.0"
		runtime ":zipped-resources:1.0"
		build ":tomcat:$grailsVersion"
	}
}
