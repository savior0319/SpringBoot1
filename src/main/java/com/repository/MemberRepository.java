package com.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.model.Member;

public interface MemberRepository extends CrudRepository<Member, String>, QuerydslPredicateExecutor<Member> {

}
