package jsp.jese8.Dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;


import jsp.jese8.Dto.EmpDto;

@Component
public class EmpDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insert(EmpDto dto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
	}
	public EmpDto findbyid(String email) {
		// TODO Auto-generated method stub
		EmpDto dto=entityManager.find(EmpDto.class, email);
		return dto;
	}
	public void deletedata(EmpDto dto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.remove(dto);
		entityTransaction.commit();
	}
	
//	public EmpDto updatename(String email) {
//		// TODO Auto-generated method stub
//		EmpDto dto2=entityManager.find(EmpDto.class,email);
//		return dto2;
//	}
	public void updatedata(String email,String name) {
		EmpDto dto2=entityManager.find(EmpDto.class,email);
		dto2.setName(name);
		// TODO Auto-generated method stub
	entityTransaction.begin();
	entityManager.merge(dto2);
	entityTransaction.commit();
	}
	public EmpDto  fetchEmail(String email) {
	EmpDto dto1=entityManager.find(EmpDto.class, email);
	return dto1;
	}
	public List<EmpDto> fetchAll() {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("select data from EmpDto data");
		List<EmpDto>emp=query.getResultList();
		return emp;
	}
	
	
	
}
