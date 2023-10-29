package com.example.treino.persist;

import com.example.treino.model.Usuario;
import com.example.treino.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Persistencia {
    public static void SalvarUsuario(Usuario u){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(u);
        transaction.commit();
    }
}
