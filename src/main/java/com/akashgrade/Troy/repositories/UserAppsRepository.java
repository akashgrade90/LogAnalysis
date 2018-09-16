package com.akashgrade.Troy.repositories;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;

import com.akashgrade.Troy.models.UserApplications;


@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "UserApplications")
public interface UserAppsRepository extends CouchbasePagingAndSortingRepository<UserApplications, String> {

}