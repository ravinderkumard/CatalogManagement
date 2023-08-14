/**
 * 
 */
package com.ecom.catalogmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.catalogmanagement.domain.CategoryGroup;

/**
 * @author ravinderkumar
 *
 */
@Repository
public interface CategoryGroupRepository extends JpaRepository<CategoryGroup, Integer> {

}
