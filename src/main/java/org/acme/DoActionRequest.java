package org.acme;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

public class DoActionRequest
{
	@Schema(ref = "#/components/schemas/ListOfValues")
	public String value;
}
