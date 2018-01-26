package com.borisruzanov.social.dependency.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Boris on 1/26/2018.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthScope {
}
