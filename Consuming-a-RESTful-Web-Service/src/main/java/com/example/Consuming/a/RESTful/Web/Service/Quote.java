package com.example.Consuming.a.RESTful.Web.Service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote(String type, JsonIgnoreProperties.Value value) {

}
