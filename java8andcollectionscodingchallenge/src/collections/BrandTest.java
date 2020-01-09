package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class BrandTest {
	public static void main(String[] args) {
		Set<User> users=new HashSet<User>();
		users.add(new User(1,"Prateek",23,1000,new Phone(1,"9123455678")));
		users.add(new User(2,"Prakash",26,1000,new Phone(3,"9123455673")));
		users.add(new User(3,"Prakhar",26,1000,new Phone(2,"9123455674")));
		Set<User> users1=new HashSet<User>();
		users1.add(new User(3,"Ram",29,7400,new Phone(3,"9123465678")));
		users1.add(new User(4,"Kartik",34,8900,new Phone(4,"9123457673")));
		Set<User> users2=new HashSet<User>();
		users2.add(new User(5,"Pramod",23,78000,new Phone(5,"9123455638")));
		users2.add(new User(6,"Prakhar",24,88000,new Phone(6,"8123455673")));
		Set<User> users3=new HashSet<User>();
		users3.add(new User(7,"Ramu",29,7408,new Phone(7,"9123444678")));
		users3.add(new User(8,"Krishna",34,8200,new Phone(8,"9123337673")));
		Set<Models> models=new HashSet<Models>();
		models.add(new Models(1,"ABC",users));
		models.add(new Models(2,"DBC",users1));
		Set<Models> models1=new HashSet<Models>();
		models1.add(new Models(3,"DTC",users2));
		models1.add(new Models(4,"DLC",users3));
		Set<Brand> brands=new HashSet<Brand>();
		brands.add(new Brand(1,"Addidas",models));
		brands.add(new Brand(2,"Reebok",models1));
		List<Brand> brandList=new ArrayList<Brand>(brands);
		Collections.sort(brandList,Collections.reverseOrder());
		for (Brand brand : brandList) {
			System.out.println("====="+brand.getBrandName()+"=======");
			List<Models> modelList=new ArrayList<Models>(brand.getModels());
			Collections.sort(modelList,Collections.reverseOrder());
			for (Models model : modelList) {
				System.out.println("::::::"+model.getModelName()+":::::::");
				for (User user : model.getUsers()) {
					System.out.println(user.getUserName()+"-"+user.getPhone().getPhoneNumber());
					
				}
				
			}
			
		}
		
List<User> usersList=new ArrayList<User>(users);
List<Adults> adults=usersList.stream().map(i->converUserToAdult(i)).collect(Collectors.toList());
adults.stream().forEach(i->{System.out.println(i.getAdultAge()+" "+i.getAdultName()+" "+i.getAdultSalary());});
Set<Adults> adultResult=new HashSet<Adults>();
adults.stream().forEach(i->{if(i.getAdultAge()>25 && i.getAdultSalary()<100000) {adultResult.add(i);} });
Function f=()->adultResult;
System.out.println(f.adultsFiltered());
//List<Adults> adultsList=new ArrayList<Adults>();
/*adultsList.add(new Adults("Vibhuti",20,100));
adultsList.add(new Adults("Shahrukh",23,100));
adultsList.add(new Adults("Salman",24,100));
adultsList.add(new Adults("Salman",1,100));*/
Set<Adults> adultResult1=users1.stream().map(i->converUserToAdult(i)).collect(Collectors.toSet());
Set<Adults> adultResult2=users2.stream().map(i->converUserToAdult(i)).collect(Collectors.toSet());
Set<Adults> adultResult3=users3.stream().map(i->converUserToAdult(i)).collect(Collectors.toSet());


System.out.println(Function.totalSalary(adultResult)+Function.totalSalary(adultResult1)+Function.totalSalary(adultResult2)+Function.totalSalary(adultResult3));



	}

	private static Adults converUserToAdult(User i) {
		// TODO Auto-generated method stub=
		Adults adults=new Adults();
		adults.setAdultName(i.getUserName())  ;
		if(i.getAge()>18)
		{
			adults.setAdultAge(i.getAge());
		}
		else {
			adults.setAdultAge(18);
		}
		adults.setAdultSalary(i.getSalary());
		return adults;
		
	}

}
