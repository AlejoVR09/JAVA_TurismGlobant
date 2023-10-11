package org.example.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.datamodels.AffiliatedUserModel;
import org.example.entities.AffiliatedUser;

import java.util.List;

public class AffiliatedUserService {
    public void registrarAfiliado(AffiliatedUser affiliatedUser){
        //Nombre del traductor para hacer la persistencia
        String configuracionPersistencia="conexionbd";

        //Creamos una variable para la conexion
        //creamos una variable para manjear la conexion
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;

        try{
            entityManagerFactory= Persistence.createEntityManagerFactory(configuracionPersistencia);
            entityManager=entityManagerFactory.createEntityManager();

            //crear un modelo de datos y lo voy a cargar con informacion
            AffiliatedUserModel modeloUsuarioAfiliado=new AffiliatedUserModel();
            modeloUsuarioAfiliado.setNames(affiliatedUser.getNames());
            modeloUsuarioAfiliado.setDocument(affiliatedUser.getDocument());
            modeloUsuarioAfiliado.setEmail((affiliatedUser.getEmail()));
            modeloUsuarioAfiliado.setUbication((affiliatedUser.getUbication()));

            //Inicie la transaccion
            entityManager.getTransaction().begin();

            //activar la persistencia
            entityManager.persist(modeloUsuarioAfiliado);

            //registro de la operacion
            entityManager.getTransaction().commit();

            System.out.println("exito en la transaccion, afiliado registrado con exito");
        }catch(Exception error){
            System.out.println("fallamos "+error.getMessage());
        }finally{
            if(entityManager !=null){
                entityManager.close();
            }
            if(entityManagerFactory !=null){
                entityManagerFactory.close();
            }
        }
    }

    public void eliminarAfiliado(AffiliatedUser affiliatedUser){
        //Nombre del traductor para hacer la persistencia
        String configuracionPersistencia="conexionbd";

        //Creamos una variable para la conexion
        //creamos una variable para manjear la conexion
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;

        try{
            entityManagerFactory= Persistence.createEntityManagerFactory(configuracionPersistencia);
            entityManager=entityManagerFactory.createEntityManager();

            //crear un modelo de datos y lo voy a cargar con informacion
            AffiliatedUserModel modeloUsuarioAfiliado=new AffiliatedUserModel();
            modeloUsuarioAfiliado.setNames(affiliatedUser.getNames());
            modeloUsuarioAfiliado.setDocument(affiliatedUser.getDocument());
            modeloUsuarioAfiliado.setEmail((affiliatedUser.getEmail()));
            modeloUsuarioAfiliado.setUbication((affiliatedUser.getUbication()));

            //Inicie la transaccion
            entityManager.getTransaction().begin();

            //activar la persistencia
            entityManager.remove(entityManager.find(AffiliatedUserModel.class, modeloUsuarioAfiliado.getId()));

            //registro de la operacion
            entityManager.getTransaction().commit();

            System.out.println("exito en la transaccion, afiliado registrado con exito");
        }catch(Exception error){
            System.out.println("fallamos "+error.getMessage());
        }finally{
            if(entityManager !=null){
                entityManager.close();
            }
            if(entityManagerFactory !=null){
                entityManagerFactory.close();
            }
        }
    }

    public List<AffiliatedUserModel> buscarAfiliados(){
        return null;
    }
}
