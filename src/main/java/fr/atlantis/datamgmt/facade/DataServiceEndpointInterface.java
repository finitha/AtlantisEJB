/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.atlantis.datamgmt.facade;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author gmartin
 */
@WebService(name="DataEndpoint")
public interface DataServiceEndpointInterface {
    @WebMethod(operationName="loginOperation")
    @WebResult(name="acceptedLogin")
    Boolean login(@WebParam(name="username")String username, @WebParam(name="password")String password);
}
