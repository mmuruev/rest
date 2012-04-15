package ee.mf.rest;

import ee.mf.transaction.ITransactionBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/payment")
public class CPaymentService {
    @Autowired
    ITransactionBo transactionBo;

    @GET
    public String savePayment() {
        return transactionBo.save();
    }
}
