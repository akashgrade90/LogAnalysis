package com.akashgrade.Troy.repositories;

import java.util.List;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;

import com.akashgrade.Troy.models.Applications;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "Applications")
public interface ApplicationsRepository extends CouchbasePagingAndSortingRepository<Applications, String> {

	
	List<Applications> findByParentAppId(String parentAppId);
	
    List<Applications> findByOwnerId(String ownerId);
    
    
//	  Page<Users> findByFirstNameAndLikeLastName(String firstName, String lastName, Pageable pageable);

//    @Query("#{#n1ql.selectEntity} where #{#n1ql.filter} and companyId = $1 and $2 within #{#n1ql.bucket}")
//    ApplicationUsers findByCompanyAndAreaId(String companyId, String areaId);
//
//    @Query("#{#n1ql.selectEntity} where #{#n1ql.filter} AND ANY phone IN phoneNumbers SATISFIES phone = $1 END")
//    List<ApplicationUsers> findByPhoneNumber(String telephoneNumber);
//
//    @Query("SELECT COUNT(*) AS count FROM #{#n1ql.bucket} WHERE #{#n1ql.filter} and companyId = $1")
//    Long countBuildings(String companyId);
    
}

