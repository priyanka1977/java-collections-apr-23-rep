Manish inputs - Python

         - Arrays
         - List
         - Tuples

Objective of join the training - refresh on the knowledge of collections

- equals()
- hashcode()
- Comparable and Comparator
- HashSet
- Maps

# Java Collections

    - Use ArrayList (Default collections)
    problem statement - Store data in the application

OOP languages - Core, Web, Enterprise application - Classes
Data stored in Objects

Object > properties > values (Data) that represents an Object
Objects represents STATE
Class named Student
{

     name
     id
     course
     department

}
Objects will contain these properties initialized with data

# Requirement in our applications

- Searching of data
- Ordering of data
- display of data
- business logic on data
  Account account1, Account account2 - logic to transfer money
- retrieve objects based on some category

Object (s) to be initialized with data
source for getting data ??? Database, Files, manually intialized within the code

class Student{

    constructor(name, id){
       this.name = name;
       this.id = id;;
    }

}
Constructors are method in OOP code that are used to initialize data in object at the runtime.

In my code:

1. Manual : Student s = new Student("john", 123); // static data

2. Database: an api like JDBC
   // database connection
   // prepared statement object statement = ("select \* from student");
   // result set -> rs while(rs.next()){
   name = rs.getString();
   }

Student s = new Student(name, rs.getInt());

3. Files (I/O)
   ObjectInputStream....
   FileInputStream.read() -> byte > byte into string

   // initialize the data into object

4. Enterprise application - kafka
   Objects are populated from messages

==================================================
Architecture of app
Database - Persistence storage - where data is stored permanently
Java Application - Components / Class
Memory - managed by JVM. JVM creates objects and initializes objects with data from Database or data from files or static data

Implementation:

# Creating database

create table student(

      firstname varchar(50),
      lastname varchar(50),
      id int not null,
      course varchar(50),
      primary key (id)

)
