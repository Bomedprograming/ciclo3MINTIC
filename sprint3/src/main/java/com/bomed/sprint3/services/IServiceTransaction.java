package com.bomed.sprint3.services;

import com.bomed.sprint3.entity.Transaction;
import com.bomed.sprint3.repositories.IRepositoryTransaction;
import com.bomed.sprint3.entity.Enterprise;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class IServiceTransaction {

    private IServiceEnterprise iServiceEnterprise;

    private IRepositoryTransaction repository;

    public IServiceTransaction(IRepositoryTransaction repository, IServiceEnterprise iServiceEnterprise){
        this.repository =repository;
        this.iServiceEnterprise =iServiceEnterprise;
    }
    public List<Transaction> listTransaction(Long id){
        Enterprise emp = this.iServiceEnterprise.searchEnterprise(id).get();
        return emp.getTransactions();
    }

    public Transaction searchTransaction(Long id, int index){
        Enterprise emp = this.iServiceEnterprise.searchEnterprise(id).get();
        Transaction mov = null;
        for (Transaction p:emp.getTransactions()){
            if(p.getId() == index){
                mov =new Transaction(p.getId(), p.getConcept(), p.getAmount(), p.getEmployee(), emp);
                break;
            }
        }
        return mov;
    }

    public String createTransaction(Transaction transaction, Long id){
        Enterprise emp = this.iServiceEnterprise.searchEnterprise(id).get();

        transaction.setEnterprise(emp);

        this.repository.save(transaction);
        return "Se creó la transacción";
    }
    public String deleteTransaction(long index, Long id){
        Enterprise emp=this.iServiceEnterprise.searchEnterprise(id).get();
        Transaction mov=null;
        for (Transaction p: emp.getTransactions()){
            if (p.getId()== index){
                mov = new Transaction(p.getId(),p.getConcept(), p.getAmount(), p.getEmployee(), emp);
            }
        }
        if (mov !=null){
            emp.getTransactions().remove(mov);
            this.repository.deleteById(index);
            return "Se eliminará la transacción ";
        }else{
            return "No se eliminó la transacción";
        }
    }

    public Transaction updateTransaction(long index, Map<Object, Object>TransactionMap){
        Transaction mov = repository.findById(index).get();
        TransactionMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Transaction.class,(String)key);
            field.setAccessible(true);
            ReflectionUtils.setField(field,mov,value);
        });
        return repository.save(mov);
    }

}