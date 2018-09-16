package com.akashgrade.Troy.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.data.couchbase.repository.config.RepositoryOperationsMapping;

import com.akashgrade.Troy.models.Events;
import com.akashgrade.Troy.models.UserApplications;
import com.akashgrade.Troy.models.Applications;
import com.couchbase.client.java.Bucket;

@Configuration
@EnableCouchbaseRepositories
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

	@Override
	protected List<String> getBootstrapHosts() {
		return Arrays.asList("localhost");
	}

	@Override
	protected String getBucketName() {
		return "AppUsers";
	}

	@Override
	protected String getBucketPassword() {
		return "root@123";
	}
	
	@Bean
	public Bucket UserApplications() throws Exception {
	    return couchbaseCluster().openBucket("UserApplications", "root@123");
	}
	
	@Bean
	public CouchbaseTemplate UserApplicationsTemplate() throws Exception {
	    CouchbaseTemplate template = new CouchbaseTemplate(
	      couchbaseClusterInfo(), UserApplications(),
	      mappingCouchbaseConverter(), translationService());
	    template.setDefaultConsistency(getDefaultConsistency());
	    return template;
	}
	
	@Bean
	public Bucket Events() throws Exception {
	    return couchbaseCluster().openBucket("Events", "root@123");
	}
	
	@Bean
	public CouchbaseTemplate EventsTemplate() throws Exception {
	    CouchbaseTemplate template = new CouchbaseTemplate(
	      couchbaseClusterInfo(), Events(),
	      mappingCouchbaseConverter(), translationService());
	    template.setDefaultConsistency(getDefaultConsistency());
	    return template;
	}
	
	@Bean
	public Bucket Applications() throws Exception {
	    return couchbaseCluster().openBucket("Applications", "root@123");
	}
	
	@Bean
	public CouchbaseTemplate ApplicationsTemplate() throws Exception {
	    CouchbaseTemplate template = new CouchbaseTemplate(
	      couchbaseClusterInfo(), Applications(),
	      mappingCouchbaseConverter(), translationService());
	    template.setDefaultConsistency(getDefaultConsistency());
	    return template;
	}
	
	
	
	@Override
	public void configureRepositoryOperationsMapping(RepositoryOperationsMapping baseMapping) {
	    try {
	        baseMapping.mapEntity(UserApplications.class, UserApplicationsTemplate());
	        baseMapping.mapEntity(Events.class, EventsTemplate());
	        baseMapping.mapEntity(Applications.class, ApplicationsTemplate());
	    } catch (Exception e) {
	        //custom Exception handling
	    }
	}
	
	
	
	
	
}