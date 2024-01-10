package omkarsirnew.com.om.xwork.esay.event;


// exception are chucked exception compiler tell r forcing to handle
//runtimeException   are unchucked exception compiler not tell to handle 

import javax.management.InvalidApplicationException;
import javax.swing.undo.CannotRedoException;

import omkarsirnew.com.om.xwork.esay.exception.OmSirException;
import omkarsirnew.com.om.xwork.esay.exception.OmSirRunTimeException;

public class Fest {
	
	public void bus() throws InvalidApplicationException,OmSirException { 
		System.out.println("invokong in bus method");
		
		throw new InvalidApplicationException(getClass());
		
	}
	public void train() {
		System.out.println("invoking in train method");
		
		throw new OmSirRunTimeException();
		
	}
	


}
