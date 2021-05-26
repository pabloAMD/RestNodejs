package com.mycompany.service.resources;


import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import modelo.Banco;
import modelo.Cuenta;
import modelo.Respuesta;
import modelo.Usuario;

/**
 *
 * @author
 */
@Path("/Servicios")
public class Servicios {
 
    private static List<Usuario> users = new ArrayList<>();
    private static Cuenta cuent1 = new Cuenta("001", 200.00);
    private static Cuenta cuent2 = new Cuenta("002", 20.00);
    private static Banco b1 = new Banco(01, "Banco de Guayaquil", "Orquideas");
    private static Banco b2 = new Banco(01, "Banco del Austro", "Orquideas");

    static {
        users.add(new Usuario(1, "Jonnathan", "Ochoa", "jochoac6@est.ups.edu.ec", cuent1, b1));
        users.add(new Usuario(2, "Jonnathan2", "Ochoa", "jochoac6@est.ups.edu.ec", cuent2, b2));

    }

    @GET
    @Path("/listar")
    @Produces("aplication/json")
    public List<Usuario> listarUsuarios() {

        for (Usuario user : users) {
            System.out.println("Uuario" + users);

        }
        return users;
    }

    @GET
    @Produces("application/json")
    @Path("depositar/{id}/{valor}/{bancoDeposito}/{numeroCuentaD}")
    public Response depositar(@PathParam("id") String id, @PathParam("valor") double valor,
                                @PathParam("bancoDeposito") String bancoDeposito,
                                @PathParam("numeroCuentaD") String numeroCuentaD) {

        for (Usuario p : users) {
            if (p.getId() == Integer.parseInt(id)) {

                System.out.println("EMPRESA DE BANCOS\n");
                System.out.println("" + p.getBanco().getNombre());
                System.out.println("GESTION DE DEPOSITOS\n");
                System.out.println("NOMBRES :" + p.getNombre() + " " + p.getApellido() + "\n");
                System.out.println("SALDO " + p.getCuenta().getSaldo() + "\n");
                System.err.println("DEPOSITA " + valor);

                p.getCuenta().setSaldo(p.getCuenta().getSaldo() + valor);
               
                System.out.println("SALDO ACTUAL$ " + p);
                
                
                Respuesta respuesta = new Respuesta(bancoDeposito,numeroCuentaD,valor);
                System.out.println("Respuesta " + respuesta);
                
                return Response.ok(respuesta).build();
                
               

            } else {
                System.out.println("ID NO ENCONTRADO");
            }

        }
        return Response.ok("ERROR").build();

    }
    
    
    @PUT
    @Produces("application/json")
    @Path("retirar/{id}/{valor}")
    public Response retirar(@PathParam("id") String id, @PathParam("valor") double valor) {

        for (Usuario p : users) {
            if (p.getId() == Integer.parseInt(id)) {

                System.out.println("EMPRESA DE BANCOS\n");
                System.out.println("" + p.getBanco().getNombre());
                System.out.println("GESTION DE RETIROS\n");
                System.out.println("NOMBRES :" + p.getNombre() + " " + p.getApellido() + "\n");
                System.out.println("SALDO " + p.getCuenta().getSaldo() + "\n");
                System.err.println("RETIRA " + valor);

                p.getCuenta().setSaldo(p.getCuenta().getSaldo() - valor);
               
                System.out.println("SALDO ACTUAL$ " + p);

                return Response.ok(p).build();

            } else {
                System.out.println("ID NO ENCONTRADO");
            }

        }
        return Response.ok("ERROR").build();

    }
    
    
    @POST
    @Produces("application/json")
    @Path("buscar/{numeroCuenta}")
    public Response Buscar(@PathParam("numeroCuenta") String id) {
      
        for (Usuario p : users) {
            if (p.getCuenta().getNumeroCuenta().equals(id) ) {
                
                System.out.println("Usuario :"+p.getNombre()+"  "+p.getApellido());
                
                Cuenta buscar=p.getCuenta();
                
                System.out.println("Asociado a la cuenta:"+buscar);

                return Response.ok(buscar).build();

            } else {
                System.out.println("CUENTA NO ENCONTRADO");
            }

        }
        return Response.ok("ERROR").build();

    }
    
   

}
