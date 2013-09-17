/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.ltp3.trabalhoFinal.domainModel;

import br.edu.ifnmg.ltp3.trabalhoFinal.dataAccess.OrientadorDAO;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;


public class testeA {
    public static void main(String args[]) throws SQLException{
      
        Orientador obj = new Orientador();
       
      /*
        EntityManager manager;
       
       EntityManagerFactory factory;
       
       factory = Persistence.createEntityManagerFactory("eatSysPU");
       
       manager =  factory.createEntityManager();
    
    
    
       Orientador obj = new Orientador();
       CursoArea c = new CursoArea("TADS", "tads");
       
       obj.setNome("Anderson");
       obj.setMatriculaSiape(1234);
       obj.setCursoArea(c);
       
       Campus campus = new Campus("januaria");
    
       Nacionalidade nacionalidade = new Nacionalidade("brasileiro");
       
       Estado estado = new Estado("januaria", "mg");
       
       Cidade cidade = new Cidade();
       
       obj.setPessoaCampus(campus);
       obj.setPessoaCidade(cidade);
       obj.setPessoaEstado(estado);
       obj.setPessoaNacionalidade(nacionalidade);
       
       
       EntityTransaction transacao;
       
       transacao = manager.getTransaction();
        
        try{
            //iniciar a trnsacao
            transacao.begin();
            
            //Persiste o objeto
            manager.persist(cidade);
            
            //se tudo ocorrer bem confirma a transacao
            transacao.commit();
            
            
        }catch(Exception e){
            e.printStackTrace();
            transacao.rollback();
           
        }
       
       
       
       
       
       
       //persiste o estado
        transacao = manager.getTransaction();
        
        try{
            //iniciar a trnsacao
            transacao.begin();
            
            //Persiste o objeto
            manager.persist(estado);
            
            //se tudo ocorrer bem confirma a transacao
            transacao.commit();
            
            
        }catch(Exception e){
            e.printStackTrace();
            transacao.rollback();
           
        }
       
       
       
       
       //persiste a anacionalidade
        transacao = manager.getTransaction();
        
        try{
            //iniciar a trnsacao
            transacao.begin();
            
            //Persiste o objeto
            manager.persist(nacionalidade);
            
            //se tudo ocorrer bem confirma a transacao
            transacao.commit();
            
            
        }catch(Exception e){
            e.printStackTrace();
            transacao.rollback();
           
        }
       
       
       
       //persiste o camous
        transacao = manager.getTransaction();
        
        try{
            //iniciar a trnsacao
            transacao.begin();
            
            //Persiste o objeto
            manager.persist(campus);
            
            //se tudo ocorrer bem confirma a transacao
            transacao.commit();
            
            
        }catch(Exception e){
            e.printStackTrace();
            transacao.rollback();
           
        }
       
       
       //Persiste a area
        transacao = manager.getTransaction();
        
        try{
            //iniciar a trnsacao
            transacao.begin();
            
            //Persiste o objeto
            manager.persist(c);
            
            //se tudo ocorrer bem confirma a transacao
            transacao.commit();
            
            
        }catch(Exception e){
            e.printStackTrace();
            transacao.rollback();
           
        }
       
       
       
       
       
       for(int i=0 ; i<10;i++){
       
        //Persiste o orientador
         transacao = manager.getTransaction();

         try{
             //iniciar a trnsacao
             transacao.begin();
             obj.setNome("Pessoa "+i);
             //JOptionPane.showMessageDialog(null, obj.getNome());

             //Persiste o objeto
             manager.persist(obj);

             //se tudo ocorrer bem confirma a transacao
             transacao.commit();


         }catch(Exception e){
             e.printStackTrace();
             transacao.rollback();

         }



     }
    */
        obj.setNome("Anderson");
    OrientadorDAO  dao = new OrientadorDAO();
        List<Orientador> Buscar = dao.Buscar(obj);
        
        JOptionPane.showMessageDialog(null, Buscar);
    
    }
}
