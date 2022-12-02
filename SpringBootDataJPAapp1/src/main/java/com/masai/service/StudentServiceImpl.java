package com.masai.service;

import java.net.Inet4Address;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;
import com.masai.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepo sRepo;
	
	@Override
	public Student registerStudent(Student student) {
		
		Student saveStudent = sRepo.save(student);
		
		return saveStudent;
	}

	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {

//		Optional<Student> opt= sRepo.findById(roll);
//		if(opt.isPresent()) {
//		Student student = opt.get();
//		
//		return student;
//		}
//		else
//			throw new StudentException("Student not found with this roll"+roll);
		
//		from java 8 we have short method 
		return sRepo.findById(roll).orElseThrow(()-> new StudentException("Student does not exist with Roll:"+roll));
		
	}

	@Override
	public List<Student> getAllStudents() throws StudentException {
		
		List<Student> students= sRepo.findAll();
		
		if(students.size()==0) {
			throw new StudentException("No student data are there !");
		}
		else
			return students;
	
	
	}

	@Override
	public Student deleteStudentByRoll(Integer roll) throws StudentException {
		// TODO Auto-generated method stub
		Optional<Student> opt= sRepo.findById(roll);
		if(opt.isPresent()) {
			
//			Student student = opt.get();
//			sRepo.delete(student);
//			return student;
			
			sRepo.delete(opt.get());
			return opt.get(); 
		}
		else
			throw new StudentException("No student found with that Roll"+roll);
	}

	@Override
	public Student updateStudentDetails(Student student) throws StudentException {
	
		Optional<Student> opt = sRepo.findById(student.getRoll());
		
		if(opt.isPresent()) {
			Student updatedStudent= sRepo.save(student);
			return updatedStudent;
		}
		else
			throw new StudentException("Invalid Student Details");
	}

	@Override
	public Student updateStudentMarks(Integer roll, Integer gmarks) throws StudentException {
		
		Student existingStudent = sRepo.findById(roll).orElseThrow(()-> new StudentException("student does not exist with roll"+roll));
		
		existingStudent.setMarks(existingStudent.getMarks()+gmarks);
		
		Student student = sRepo.save(existingStudent);
		return student;
	}

	@Override
	public List<Student> getStudentByMarks(Integer marks) throws StudentException {
		
		List<Student> student = sRepo.findByMarks(marks);
		
		if(student.size()==0)
			throw new StudentException("Sorry no result found with marks"+marks);
		else
			return student;
	}

	@Override
	public List<Student> getStudentByName(String name) throws StudentException {
		
		List<Student> students= sRepo.findByName(name);
		if(students.size()==0) {
			throw new StudentException("No student avaliable with that name"+name);
		}
		else
			return students;
	}

	@Override
	public Student getStudentByAddress(String address) throws StudentException {
		
		Student student= sRepo.findByAddress(address);
		
		if(student != null)
			return student;
		else
			throw new StudentException("No student found with this address..!");
	}

	@Override
	public List<Student> getStudentByNameOrMarks(String name, Integer marks) throws StudentException {
		
		List<Student> students= sRepo.findByNameOrMarks(name, marks);
		
		if(students.size()==0)
			throw new StudentException("No student found with name"+name +"or marks :"+marks);
		else
			return students;
	
	}

	@Override
	public String getStudentNameByRoll(Integer roll) throws StudentException {
		String name = sRepo.getStudentNameByRoll(roll);
		
		if(name == null)
				throw new StudentException("Sorry ! No student found with this roll no "+roll);
		else
			return name;
	}

	@Override
	public List<String> getNameAndMarksByAddress(String address) throws StudentException {

		List<String> addresses = sRepo.getNameAndMarksByAddress(address);
		
		if(addresses.size()==0)
			throw new StudentException("There is no student with this address :"+address);
		else
			return addresses;
	}

	@Override
	public List<StudentDTO> getNameAndMarksByAddressDTO(String address) throws StudentException {
		
		List<StudentDTO> usingdto = sRepo.getNameAndMarksByAddressDTO(address);
		
		if(usingdto.size()==0)
			throw new StudentException("No record found !");
		else
			return usingdto;
	}

	
}
