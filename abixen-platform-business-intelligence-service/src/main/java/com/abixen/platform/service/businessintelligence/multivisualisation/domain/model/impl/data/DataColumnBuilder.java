/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.service.businessintelligence.multivisualisation.domain.model.impl.data;

import com.abixen.platform.common.domain.model.EntityBuilder;

import java.util.List;

public class DataColumnBuilder extends EntityBuilder<DataColumn> {

    @Override
    public DataColumn build() {
        return super.build();
    }

    @Override
    protected void initProduct() {
        this.product = new DataColumn();
    }

    @Override
    protected DataColumn assembleProduct() {
        return super.assembleProduct();
    }

    public DataColumnBuilder name(final String name) {
        this.product.setName(name);
        return this;
    }

    public DataColumnBuilder position(final Integer position) {
        this.product.setPosition(position);
        return this;
    }

    public DataColumnBuilder values(final List<DataValue> values) {
        this.product.setValues(values);
        return this;
    }
}
