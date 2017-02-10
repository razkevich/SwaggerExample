package org.razkevich.swaggerexample;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/TestCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class TestCgServiceImpl implements TestCgService {

	@GET
	@Path("/testMethod")
	public CommonResponseVO getBankCurrencyList() {
		return new CommonResponseVO();
	}

}
