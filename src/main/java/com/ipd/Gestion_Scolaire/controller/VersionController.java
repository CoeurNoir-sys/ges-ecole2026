package com.ipd.Gestion_Scolaire.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class VersionController {

    @Value("${app.version:dev}")
    private String version;

    @GetMapping("/api/version")
    public Map<String, String> version() {
        return Map.of("application", "gestion-scolaire", "version", version);
    }
}