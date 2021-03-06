/*******************************************************************************
 *  Copyright (c) 2017 ModelSolv, Inc. and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     ModelSolv, Inc. - initial API and implementation and/or initial documentation
 *******************************************************************************/
package com.networknt.oas.validator.impl;

import com.networknt.oas.model.ExternalDocs;
import com.networknt.oas.validator.ObjectValidatorBase;

import static com.networknt.oas.model.impl.ExternalDocsImpl.F_description;
import static com.networknt.oas.model.impl.ExternalDocsImpl.F_url;

public class ExternalDocsValidator extends ObjectValidatorBase<ExternalDocs> {

	@Override
	public void runObjectValidations() {
		ExternalDocs externalDocs = (ExternalDocs) value.getOverlay();
		validateStringField(F_description, false);
		validateUrlField(F_url, true, true, false);
		validateExtensions(externalDocs.getExtensions());
	}
}
