/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2023 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.model.impl;

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;

/**
 * VoidExecutionContextDefaults
 */
public class VoidExecutionContextDefaults implements DBCExecutionContextDefaults {

    @Override
    public DBSCatalog getDefaultCatalog() {
        return null;
    }

    @Override
    public DBSSchema getDefaultSchema() {
        return null;
    }

    @Override
    public boolean supportsCatalogChange() {
        return false;
    }

    @Override
    public boolean supportsSchemaChange() {
        return false;
    }

    @Override
    public void setDefaultCatalog(DBRProgressMonitor monitor, DBSCatalog catalog, DBSSchema schema) throws DBCException {
        throw new DBCFeatureNotSupportedException();
    }

    @Override
    public void setDefaultSchema(DBRProgressMonitor monitor, DBSSchema schema) throws DBCException {
        throw new DBCFeatureNotSupportedException();
    }

    @Override
    public boolean refreshDefaults(DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {
        throw new DBCFeatureNotSupportedException();
    }
}
