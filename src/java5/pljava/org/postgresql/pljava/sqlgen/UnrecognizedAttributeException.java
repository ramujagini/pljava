/*
 * Copyright (c) 2004 TADA AB - Taby Sweden
 * Distributed under the terms shown in the file COPYRIGHT
 * found in the root directory of this distribution or at
 * http://eng.tada.se/osprojects/COPYRIGHT.html
 */
package org.postgresql.pljava.sqlgen;

/**
 * @author Thomas Hallgren
 */
public class UnrecognizedAttributeException extends IllegalArgumentException
{
	UnrecognizedAttributeException(String attributeName)
	{
		super("The attribute " + attributeName + " is not recognized");
	}
}