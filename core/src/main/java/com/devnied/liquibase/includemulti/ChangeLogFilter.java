package com.devnied.liquibase.includemulti;

import liquibase.changelog.IncludeAllFilter;

public class ChangeLogFilter implements IncludeAllFilter {
    @Override
    public boolean include(String changeLogPath) {
        return changeLogPath.endsWith(".xml");
    }
}
