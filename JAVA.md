```md
# -: Core Java ShortNote(Interview) :

## ANGULAR

### Angular Intro:
- Angular is client side Framework used to create web application.
- Angular is mainly used for single page application development.
- Angular support all plateform (Desktop and mobile).
- Angular is having cross-browser competibility.

### Angular Architecture : (Building block of Angular)
1. Components  
2. Meta data  
3. Services  
4. Templates  
5. Directories  
6. Pipes  
7. Routing  
8. Data Binding  
9. Dependency Injection  
10. Module

### Components :
Components .ts TypeScript class which act as Request handler.  
Components class is represent by @component and having Application logic.

```ts
@component({
          selector : "app-root",
          templateUrl : './app.component.html',
          styleUrls : [./app.component.css]
 })
```

---

## OOPS (Object Oriented Programming System)

### OOPS :
It is technique, not technology. It means, it does not provides any syntaxes or API, instead it provide suggestion to design and develop object in programming languages.  
OOPS is methodology introduced to represent real world object using a program for automatic-real world business by achieving security.

### Class :
Class is a blueprint of an object from which we will create multiple objects of same type. Class is a logical entity.

### Object :
Object is real-world thing which is an instance of a class.  
Object is the physical reality of class.

- The process of creating object out of a classes is called instanstation.

**Q. : Object and instance both are same?**  
**Ans :** No,memory allocated for creating object physically with specific value it called instance. This is reason object is also defined as "instace of a class".

### Instance :
Instance is a memory created from a class for storing particular object value of this class type.

**Q. : What is OOP Principal?**  
**Ans:** OOP Principal is a rules or guideline for developing a real world object in programming world by achieving security to object data & dynamic binding, HAS-A realtion between user object and sub type objects in accessing operation from different sub-tyoes of an object.

### OOP Principal : (Object development Principals)
1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction -> It is a object design principal

**Q. : Is Java 100% OOPS ?**  
**Ans :** No,

1. It allow to to store data in primitive data types not complete object.
2. It allow us to access private data by using Reflection API encapsulation failed.
3. Does not support multiple Inheritance by using classes.

### Encapsulation :
Encapsulation is one of the OOP Principal. The process of wrapping up of variables and methods as one unit by using class and operating those variables only via methods either for reading or modifying values is called Encapsulation.  
By developing Encapsulation we are hiding data from direct access from other object, and process access via publically available setter and getter method with proper validation.

**Q. : How to create Encapuslation class?**  
**Ans :**
1. Define or declared private variables.
2. public setter and getter method.

### Inheritance :
The process of creating new class deriving from existing class for obtaining type, properties and behaviours of an existing class to this new class for extending or reusing its functionality existing class is called Inheritance.

### Advantages of Inheritance :
1. code reusibility (write code at place who common is to all classes)
2. loose coupling
3. Dynamic Binding
4. Obtaining type

#### 1. Loose Coupling :
Defining one parameter to receive any type of sub types of a given object and changing one sub type to another sub type at runtime without modifing code is called loose coupling.

#### 2. Dynamic Binding :
Executing the invoked method from different sub classes based on the passed object is called Dynamic Binding or Runtime-Polymorphism.

### Inheritance Relation established using:
1. extends
2. Implements

### Difference between Extends and Implemets ?

#### 1. Extends :
- It is used between class and class, interface and interface.
- It provide reusability to sub classes.

#### 2. Implements :
- It is used for deriving a new class from a interface for implementing the method given in this interface.
- It provides forcebility to sub class.

### Difference between this and super?

#### 1. this :
- It is used for accessing current class members.
- this type is current class, using this we can access both sub class and super class member.
- It will store current object reference then it will point to current class memory.

#### 2. super :
- It is used for accessing super class members in sub class.
- It is super class types, using super we can only access super class members. If we access subclass specific members using super keyword compile will throw error.
- It will also store current object reference it will pointing to super to super class memory.

### Difference between super() and super?

#### 1. super() :
- It is used for calling super class constructor.
- It allow only in subclass cons as first statement.
- It is placed by compiler automatically inside constructor if need programmer also can place.
- We can not place multiple super().

#### 2. super :
- It is used for calling super class variables and methods.
- It is allowed in all methods anywhere. But in constructors, it is not allowed except as the first statement.
- It should be placed by the programmer only. Compiler will not place it automatically.
- We can place multiple "super" (calls).

### InstanceOf operator :
InstanceOf operator is used only for checking whether given object type is of given class type or not. if object is different it will return false.

```java
A a1 = new B();
(a1 instanceOf  B)
```

### Cast Operator :
Cast Operator is used for checking or converting given object into given class type. If object is different it will throw class cast Exception.

```java
A a1 = new B();
B b1 = (B) a1; // [ B -> cast operator]
C c1 = (C) a1; // [C -> cast operator]
```

for avoiding class acst Exception we are using instanceOf operator in if condition.  
We are using cast operator during down casting.  
Down casting is used for access sub class members.

**Q. : In down casting What exactly happening?**  
**Ans :** Just reference is changed from super class to sub class, new object is not created , both super class variable and sub class variable are pointing to same object to their own class members.

### Up Casting :
It is process of storing sub class object into super class reference variable is called Up casting.

### Why ? :
We do upcasting for achieving LC, means single reference variable storing different sub class object and able to change from one sub class object to another sub class object at runtime without modifing code is called Loose coupling.

**Q. : What are problem with Upcasting?**  
**Ans :** An Upcasting with super class reference variable we can not access sub class specific members.

### Method Hiding :
Redefining super class static method in sub class with sub class required logic is called method Hiding.

### Method Overriding :
Redefining super class non-static method in sub class with sub class required logic is called Method Overriding.

### Rule :
- We can hide or overhide a method only in sub class not in same class.
- We can overload a method in a same class or in sub class.

### Difference Between Method hiding and Method Overriding ?

#### 1. Method Hiding :
- Both Parent class and child class method should be static.
- Method Resolution takecare by compiler based on reference type.
- Method hiding is compile time polymorphism or static polymorphism or early binding.

#### 2. Method Overriding :
- Both Parent class and child class methods be non-static.
- Method Resolution take care by JVM based on runtime object.
- Overriden is runtime polymorphism or Dynamic polymorphism or late binding.

**Q .: Modifier not allowed in Overriden method?**  
**Ans :** Private / final / static

- Return type of Overriden method is same up to (1.4V) (1.5V) onword co-varient return type.

### Types of Inheritances :
1. Single Inheritance
2. Multi-Level Inheritance
3. Hierachical Inheritance
4. Hybrid Inheritance
5. Multiple Hybrid Inheritance

#### 1. Single Inheritance :
- One base class and one derived class. (OR) If two classes or two interfaces or a class and interface participating in an inheritance. It is called Single Inheritance.

#### 2. Multi-Level Inheritance :
- Base class, derived class, and further derived classes forming a chain. (OR) If more than two classes are participating in inheritance realtion verically we called it as multi-Level inheritance.

#### 3. Hierarchical Inheritance :
- Multiple classes inherit from a single parent class. (OR) If we drive multiple sub classes from a single super class we call it as hierarchical inheritance.

#### 4. Hybrid Inheritance :
- Combines multiple inheritance types, such as hierarchical and multi-level. (OR) Developing an inheritance by comibining other types of inheritance is called Hybrid.

#### 5. Multiple Hybrid Inheritance :
- Deriving a sub class from multiple super class is called multiple inheritance.

### Polymorphism :
Providing multiple Implemention for same operation either in same class or in sub class.  
It is a process of defining class with multiple method with same name with different implementation is called polymorphism.

We develop ploymorphism by using :
1. Method overloading
2. Method overriding

### Type of Polymorphism :
1. Compile-time polymorphism
2. Runtime polymorphism

### Abstraction :
It is a process of defining a class by proving necessary details tto call object operation by removing or hiding its implementation deatils for developing loosely coupled runtime polymorphism object user class.  
Abstraction is fundamental principal of modeling. It make syre all 3 OOP principal are working together to provide final shape to project.

---

## STRING HANDLING

### String :
String is a immutable sequence of characters placed double quote (" "), Performing different operation or String data is called String Handling.

String are constant, their value cannot be changed in the same memory after they are created. String is defined as it an immutable sequence of characters.  
String having total 15 constructor.

**Q. : Why String object is immutable?**  
**Ans :** Because of String Pooling concept.

### String Pooling :
String pooling means pooling string, it means grouping string object. it is used for reusing.  
If we create string object by assigning same string literal, only one object is created and all reference variable are initailized with same string object reference. the all referenced variables are poiting to same string object. This is reason why string objectbecome immutable. It means string data modification is not stored in same memory.  
This string pooling concept is not applicable for string object those are created using "new keyword and constructor".

**Q. : Why this string pooling?**  
**Ans :** To improve performance by saving memory.

### Methods of String :
1. `public char charAt(int index)`
2. `public String concat(String s)`
3. `public boolean equals(Object o)`
4. `public boolean eqaulsIgnoreCase(Object o)`
5. `public boolean isEmpty()`
6. `public int length()`
7. `public String replace(char old, char new)`
8. `public String subString(int begin)`
9. `public String subString(int begin, int end)`
10. `public int indexOf(char ch)`
11. `public int lastIndexOf(char ch)`
12. `public String toLowerCase()`
13. `public String toUpperCase()`
14. `public String trim()`

### String Buffer :
It is thread-safe, mutable sequences of characters. A String Buffer is like a String but can be modified in the same memory location.

### String Buffer Constructor :
String Buffer Having 4 Constructor.

1. `public StringBuffer()` -> Defalut capacity - 16
2. `public StringBuffer(int capacity)`
3. `public StringBuffer(String s)` -> `[16 + s.length()]`
4. `public StringBuffer(charSequence cs)` -> `[16 + cs.length()]`

### Methods String Buffer :
1. `public StringBuffer append(xx data)` -> Overloaded Method
2. `public StringBuffer insert(int index, xx data)` -> Overloaded method(int index)
3. `public StringBuffer reverse()`
4. `public StringBuffer deleteCharAt(int index)`
5. `public StringBuffer delete(int start, int end)`
6. `public Stringbuffer setCharAt(int index. char ch)` -> Before capacity

1. `public void ensureCapacity(int minimumcapacity)` -> `[increament capacity => old capacity x 2 + 2]`
2. `public void trimToSize()`
3. `public void setLength(int newLength)`

### Comparision :
- Equals method is overroden in string class to compare String objects with state so string objects are compared with reference by using == operator and with state by using equals() method.
- In StringBuffer and StringBuilder class equals() method is not overriden, so using == operator and equals() method their objects are compared with reference.

### StringBuffer and StringBuilder have same functionality except all the method in StringBuilder are non-synchronized.

#### 1. StringBuffer:
- Every Method present in StringBuffer is synchronized.
- At a time only one thread is allow to operate on StringBuffer object and hence it is Thread Safe.
- Threads are required to wait to operate on StringBuffer object and Hence Relatively performanec is slow.
- Introduced in 1.0 Version(V).

#### 2. StringBuilder :
- No method present in String-Builder is non-synchronized.
- At a time multiple Thread are allowed to operate on String Builder object and Hence it is Not thread safe.
- Threads are not required to wait to operate on StringBuilder object and Hence Relatively Performance is high.
- Introduced in 1.5 Version(V).

---

## COLLECTION

### Difference Between Arrays and Collection?

#### 1. Arrays :
- Arrays are fixed in size.
- In Arrays we can store homogeneous elemnts.
- Arrays is not having no-underlying data structure means its not provide pre-defined method to do some operation.
- Performance wise arrays is good.

#### 2. Collection :
- Collection are growable in nature.
- In Collection we can store hemogeneous and hetrogeneous elements.
- Collection is having underlying data structure means its provide pre-defined method.
- Memory wise collection is good.

### Collection :
**(Simple Defination) :** Collection is grouping of objects in a single unit.  

**(Original Defination) :** Collection is a container object it is used to stored multiple homogeneous and hetrogeneous, unique and duplicate object without size limitation and further used for sending all object at a time one from one class to another class as method argument and return value.

---

## Java Collection Framework (Hierarchy Notes)

### 1. Collection Framework Overview

**Main Interface:** Collection (I)

#### a) List (I) :
Implements ordered collection (allows duplicate elements).

| Class | Type | Version |
|---|---|---|
| ArrayList (C) | Dynamic array | (1.2) V |
| LinkedList (C) | Doubly linked list | (1.2) V |
| Vector (C) | Legacy class | (1.0) V |
| Stack (C) | Subclass of Vector | (1.0) V |

#### b) Set (I) :
Implements collection that does not allow duplicates.

| Interface / Class | Type | Version |
|---|---|---|
| HashSet (C) | Uses HashMap internally | (1.2) V |
| LinkedHashSet (C) | Maintains insertion order | (1.4) V |
| SortedSet (I) | Sorted elements | (1.2) V |
| NavigableSet (I) | Navigation methods | (1.6) V |
| TreeSet (C) | Implements NavigableSet | (1.2) V |

#### c) Queue (I) :
Used to hold elements prior to processing (FIFO order).

| Interface / Class | Type | Version |
|---|---|---|
| Deque (I) | Double-ended queue | (1.6) V |
| PriorityQueue (C) | Priority-based queue | (1.5) V |

### 2. Map (I) :
Key-value pair collection (not part of Collection interface).

| Interface / Class | Type | Version |
|---|---|---|
| HashMap (C) | Non-synchronized | (1.2) V |
| LinkedHashMap (C) | Maintains insertion order | (1.4) V |
| WeakHashMap (C) | Garbage collector friendly | (1.2) V |
| IdentityHashMap (C) | Key comparison using == | (1.4) V |
| SortedMap (I) | Sorted by key | (1.2) V |
| NavigableMap (I) | Advanced SortedMap | (1.6) V |
| TreeMap (C) | Implements NavigableMap | (1.2) V |
| Hashtable (C) | Legacy synchronized class | (1.0) V |
| Properties (C) | Subclass of Hashtable | (1.0) V |
| Dictionary (I) | Legacy interface | (1.0) V |

### 3. Utility Classes :

| Class | Description |
|---|---|
| Collections | Utility methods for Collection framework |
| Arrays | Utility methods for array operations |

### 4. Cursor Interfaces :

| Interface | Description |
|---|---|
| Enumeration (I) | Legacy iterator |
| Iterator (I) | Modern cursor |
| ListIterator (I) | Bi-directional iterator |

### 5. Sorting :
Implemented using:
- Comparable (I)
- Comparator (I)

- Collection & map are root iterface of collection framework.
- Collection InterfacsubClass are meant for collecting object in array format.
- Map Interface sub classes are meant for collecting object in key, value pair format.
- Collection framework introduced in 1.2V.

### legecy classes :(means 1.0V classes old classes)
1. Vector(C)
2. Stack(C)
3. HashTable(C)
4. Distionary(AC)
5. Enumeration(I)
6. Properties(C)

### Collection Interface Method [(15)+5 added in java 8 feature] :
1. `public boolean isEmpty()`
2. `public boolean add(Object obj)`
3. `public boolean addAll(Collection c)`
4. `public boolean remove(Object obj)`
5. `public boolean removeAll(Collection c)`
6. `public void clear()`
7. `public boolean contains(Object obj)`
8. `public boolean containsAll(Collection c)`
9. `public boolean retainAll(Collection c)`
10. `public int size()`
11. `public Iterator iterator()`
12. `public Object[] toArray()`
13. `public boolean equals(Object obj)`
14. `public int hashCode();`

- If we want represent group of individual object as a single entity then we should go for collection.

### List(I) :
- It is child interface of collection Interface.
- If we want to represent group of individual object a single entity where insertion order is preseved and duplicates are allowed.

### List Interface Methods: [25 methods -> 15 collection + 10 List ]
1. `public void add(int index, Object element)`
2. `public boolean addAll(int index, Colleaction c)`
3. `public Object get(int index)`
4. `public Object set(int index, Object element)`
5. `public Object remove(int index)`
6. `public int indexOf(Object element)`
7. `public List subList(int start, int end)`
8. `public ListIterator listIterator()`
9. `public Object lastIndexOf(Object element)`
10. `public ListIterator listIterator(int index)`

### ArrayList : (Simple Defination)
ArrayList is implemented class of list interface and in ArrayList object are stored in indexed order and duplicates are allowed.

**(Original Defination)**  
ArrayList for storing multiple objects with index multiple includes duplicate without thread-safety or non-synchronized we must use ArrayList.

- It is Implementing serialiable, clonable & Random Access Interface.
- All methods of ArrayList is not synchronized meant it is not thread-safe.
- Give high performance in retrieving & adding.

**Q. : What is Implemented data structure of ArrayLsit?**  
**Ans :** Growable Array or Resizable Array is implemented data structure of ArrayList.

**Q. : Default Capacity, Increament Capacity. lead factor?**  
**Ans :**
- Default capacity -> 10
- Increament Capacity -> (current capacity x (3/2)+1) -> 16
- load factor not applicable here.

**Q. : What type of element allowed?**  
**Ans :** All 4 type of element allowed, homogeneous, hetrogeneous, Unique and duplicate object.

**Q. : Null allowed? How many?**  
**Ans :** Null allowed, more then one null is allowed.

**Q. : Interally calling method?**  
**Ans :** `.equals()` method in searching & removig operation.

**Q. : Performance?**  
**Ans :** High performance in adding & retrieving .  
Low perfromace in searching & removing & retrieving.

### Constructor of ArrayList :
1. `public  ArrayList()`
2. `public ArrayList(Collection c)`
3. `public ArrayList(int intial capacity)`

### LinkedList(C) :
It is implemented class of list Interface.(baki ki defination list ki hai wahi hai)

**Use :**  
If our operation are more insert ad remove element in the middle of a collection then we must use LinkedList. It give better performance to other compared to other collections for insert and remove element in middle.

**Q. : What is implemented data structure?**  
**Ans :** Implemented data structure is double-linkedList

**Q. : What type of element allowed?**  
**Ans :** Homogeneous, Hetrogeneous, duplicate and unique.

**Q. : Null allowed ? How many?**  
**Ans :** Null allowed, multiple.

**Q. : It is synchronized collection?**  
**Ans :** No, It is not synchronized.

**Q. : Internally calling method?**  
**Ans :** It internally calls equals() method in searching & retrieving operation.

**Q. : Performance?**  
**Ans :** Give high performance in insert & remove in middle of collection.

**Q. : How likedList will give high performance in insert & remove compare to ArrayList?**  
**Ans :** In ArrayList element will shift to right location in insert operation, element will shift to left location in remove operation. So in ArrayList more copied operation are perform from one location to another location.

**Q. : Which collection class implementing multiple Inheritance?**  
**Ans :** LinkedList

**Q. : Constructor of LinkedList?**  
**Ans :**
1. `Linked()`
2. `LinkedList(Collection c)`

**Q. : Methods of LinkedList?(imp methods)**  
**Ans :**
1. `public void addFirst(Object o)`
2. `public void addLast(Object o)`
3. `public Object getFirst(Object o)`
4. `public Object getLast(Object o)`
5. `public Object removeFirst(Object o)`
6. `public Object removeLast(Object o)`

### Vector :
Vector and ArrayList functionalities are same the only difference are there in :

a) ArrayList not synchronized and vector is synchronized.  
b) ArrayList Increment capacity (3/2 + 1) where vector is double.

**Use :**  
Vector is used for storing homogeneous and hetrogeneous, unique and duplicate object in insertation order with index in multi-threaded environment with thread-safety or synchronized.

**Q. : Data structure ?**  
**Ans :** Growable Array

**Q. : Default capacity, Increament Capacity?**  
**Ans :** DC -> 10, IC -> Double

**Q. : Elements Allowed?**  
**Ans :** All 4 types -> Homogeneous, Hetrogeneous, Unique and duplicate.

**Q. : What is insertion order?**  
**Ans :** Insertion order with index.

**Q. : Retrieving order?**  
**Ans :** Random Access(because it implement Random Access Interface).

**Q. : Is it synchronized?**  
**Ans :** Yes

**Q. : Internally used method?**  
**Ans :** `.equals()` method in searching and removing.

**Q. : Performance?**  
**Ans :** Gives high performance in retrieving & adding.

**Q. : Implemented Interface?**  
**Ans :** Serializable, Clonable, Random Access

**Q. : Vector Constructor?**  
**Ans :**
1. `Vector()`
2. `Vector(Collection c)`
3. `Vector(int initailCapacity)`
4. `Vector(int initailCapacity, int increasingCapacity)`

### Some Important Methods(Vectors):
1. `public void addElement(Element e)`
2. `public void insertElementAt(Element e, int index)`
3. `public void removeElement(Object o)`
4. `public void removeElementAt(int index)`
5. `public void removeAllElement(Object o)`

### Stack :
- We must use stack for storing multiple object and further for retrieving then in "last in first order" "LIFO".
- Stack is class in java which is sub Class of vector. All method of vector inherited to stack , but we should'nt use vector class method and method stack object beacause we can't retrieve object in LIFO maner.
- To treat vector as stack object class has it even method.

1. `public Object push(Object obj)`  
   => This method will store object in stack.

2. `public Object pop(Object obj)`  
   => Remove the object at the top of this stack and return that top object.

3. `public Object peek()`  
   => This will return top Object without removig

4. `public int search(Object obj)`  
   => It will return object position inside stack the position (Searching index) start with from top to bottom. Top is last element and bottom is first element.

**Q. : Data Structure?**  
**Ans :** Growable Array

**Q. : Default Capacity, Increament capacity?**  
**Ans :** Default capacity -> 10, IC -> Double

**Q. : Object allowed?**  
**Ans :** Homogeneous, Hetrogeneous, Unique and duplicate.

**Q. : Null Allowed ?**  
**Ans :** yes, More than one.

**Q. : Retrieve order?**  
**Ans :** LIFO order.

### Set(I) Implemented Classes :
- If we wat to store only unique element in collection we must use set implemented classes HashSet, LinkedHashSet, TreeSet.

### HashSet :
HashSet doesn't maintain insertion oreder it will store object in hasCode based order. It will not maintain insertion order and store only unique objects.

**Use :**  
HashSet is used for Storing only unique elements with considering storing order.

**Q. : Data structure?**  
**Ans :** HashTable backend by HashMap Instance.

- When we create HashSet Object, internally HashMap object is created, elements are store in this HashMap.

**Q. : Default capacity?**  
**Ans :** Default Capacity -> 16, IC -> Double, load factor -> 0.75 [lead factor matlab ki hashSet 75% fill ho jayega to automatic capacity double ho jayegi]

**Q. : Element or Object allowed?**  
**Ans :** Homogeneous, Hetrogeneous & Unique

**Q. : Insertion order?**  
**Ans :** Object HashCode order.

**Q. : Retrieving order?**  
**Ans :** Sequentailly

**Q. : Is it synchronizeed?**  
**Ans :** Not synchronized collection

**Q. : Internally vs Method?**  
**Ans :** hasCode() , == operator, equals() in searching removing operation, adding operation.

### HashSet Constructor[4]
1. `HashSet()`
2. `HashSet(Collection c)`
3. `HashSet(int initialCapacity)`
4. `HashSet(int initialCapacity, float loadFactor)`

### LinkedHashSet :
it is sub Class of hashSet class LinkedHashSet maintains insertion order, it will store cobject in hashCode based order and stored only unique element.

**Use:**  
When we want to store only unique element in insertion order we must use LinkedHashSet.

**Q. : Data Structure?**  
**Ans :** Double Linked List + HashTable backend by LikedHashMap instance.

**Q. How HashSet of linked HashSet on stop duplicate object?**  
**Ans :** By using hashCode, == operator and equals().

- If two object is equivalent means its hashCode must be same and store in same bucket it does'nt mean all object in bucket are equivalent.
- If two object having same hashCode it doesn't mean they are equivalent may or may not be.

### LinkedHashSet Constructor :
1. `LinkedHashSet()`
2. `LinkedHashSet(Collection c)`
3. `LinkedHashSet(int initialCapacity)`
4. `LinkedHashSet(int initialCapacity, float loadfactor)`

- LinkedHashSet implements by Serializable, Clonable, Interface.

### SortedSet :
It is a sub Interface or extends from set inetrface.

- If we want to store unique object in some sorting order.

### Methods : [15 set method + 6 specfic method]
1. `public Comparator comparator()`  
   -> Return the comparator used to order the element in this or null if this set uses the natural ordering of its element.
2. `public Object first()`  
   -> return first(lowest) element
3. `public Object last()`  
   -> return last (highest) element
4. `public sortedSet headSet(Object toElement)`  
   -> return a view of the portion of this set whose element are strictly less than toElement
5. `public sortedSet tailSet(Object toElement)`  
   -> return a view of the portion of this set whose element are greater than or equal to from element.
6. `public sortedSet subSet(Object toElement, Object fromElement)`  
   -> return a view of the portion of this Set whose element range from element to toElement.

### TreeSet :
- TreeSet is used for sorting element in sorting order either in ascending or descending on the adding object.
- TreeSet doesn't have any sorting order this sorting order should be define by the class whose object adding to TreeSet.
- The default sorting order of treeSet is that object those are adding to the default sorting order of object those are adding to TreeSet.
- For sorting object in sorting order TreeSet internally use either of two interfaces.

1. Comparable
2. Comparator

- TreeSet internally uses comparable interface method compareTo() to compare and sort Object.
- We can only add comparable Object to TreeSet.

**Q. : Data Structure?**  
**Ans :** Red-Black-Tree

**Q. : Null Allowed?**  
**Ans :** Null is not allowed NPE  
Solo null is allowed till Java 6.

**Q. : Retrieving order?**  
**Ans :** Sequential order

**Q. : Interanally method used?**  
**Ans :**
- Comparable.compareTo(-)
- Comparator.compare(-,-)

### Constructor :
1. `TreeSet()`
2. `TreeSet(Collection c)`
3. `TreeSet(Comparator c)`
4. `TreeSet(SortedSet s)`

**Q. : Element allowed?**  
**Ans :** Homogeneous And Unique

### Map :
When we want store Object in key, value pair format we must choose map type collection.

- Interface map is root interface of map types collection. It is not sub Interface of collection both Interface functioning is different.

### Map Methods :
1. `public boolean isEmpty()`
2. `public Object put(Object key, Object value)`
3. `public void putAll(Map m)`
4. `public Object remove(Object key)`
5. `public void clear()`
6. `public boolean containsKey(Object key)`
7. `public boolean containsValue(Object value)`
8. `public int size()`
9. `public Object get(Object key)`
10. `public Collection values()`
11. `public Set keySet()`
12. `public Set entrySet()`
13. `public boolean equals()`
14. `public int hashCode()`

### HashMap :
- HashMap is similar to Hashtable but it is unsynchronized.
- It allows to store the null key only once, but values can have multiple null.
- Insertion order is not preserved and is stored is based on hasCode of keys.

**Q. : Data Structure?**  
**Ans :** HashTable

**Q. : Initial Capacity & load factor?**  
**Ans :** 16 & 0.75

- Implementing Serialazable , Colnable $ Random Access Interface.
- Performance => serach

### Constructor :
1. `HashMap()`
2. `HashMap(int initialCapacity)`
3. `HashMap(int initialCapacity, float loadFator)`
4. `HashMap(Map m)`

### LinkedHashMap :
It is sub class for child class of Hashmap and it is exactly same as HashMap including methods and constructor execpt in data structure.

- LinkedHashMap underlying data Structure is LinkedList + HashTable(Hybrid data structure)
- Insertion order is preserved.
- It is sub class or child class of HashMap and it is exactly same as HashMap including method and constructor execpt the following difference.
- LinkedHashMap data structure is (LinkedList + HashTable) whereas HashMap data structure is (HashTable)
- In LinkedHashMap insertion order is preserved whereas HashMap insertion order is not preseved and it is based on hashCode ok keys.

### Identity HashMap :
It is implemented class of map interface and it is exactly same as HashMap including method and constructor except different.

- In IdentifyHashMap JVM use == operator to identify duplicate keys which is meant for reference comparision whereas In normal HashMap JVM use .equals() methodss to identify duplicate keys, which is meant for content comparision.

### WeakhashMap :
It is exactly same as HashMap execpt the following difference:

- In case of HashMap even through object doesn't have any reference hence it is not eligible for garbage collector. If it associate with map that is HashMap dominates garbage collector.
- In case of weakHashMap, if object doesn't contains any reference hence it is eligible for garbage collector , even through Object associate with HashMap that is garbage collector dominate weakHashMap.

### SortedMap :
It is child interface of map. If we want to represent a group of key, value pair in some sorting order based on keys.

- Sorting is based on keys not values.

### Methods:
1. `public Object firstKey()`
2. `public Object lastKey()`
3. `public SortedMap headMap(Object a)`
4. `public SortedMap tailMap(Object b)`
5. `public SortedMap subMap(Object a, Object b)\`
6. `public Comparator comparator()` -> null for default sorting order.

### TreeMap :
It is implemented class of navigable map. If we want to represent group of (key, value) pair in some sorting order based on keys.

- If we want default sorting order then keys should be comparable and Homogeneous.

**Q. : Data structure ?**  
**Ans :** Red-Black-Tree

**Q. : Insertion order?**  
**Ans :** Insertion order is not preserved and it is based on some sorting order of keys.  
Duplicate keys are not allowed but values can be duplicated.

**Q. : Null allowed?**  
**Ans :**
- for non-Empty treeMap if want to insert on entry with null key. The we get Runtime exception NPE
- For empty the map treeMap as a first entry. If we trying to insert any other entry then we get RE:NPE
- Until 1.6V after this null is not allowed for key.
- For values we can insert multiple null.

### Constructor :
1. `TreeMap()`
2. `TreeMap(Comparator c)`
3. `TreeMap(Map m)`
4. `TreeMap(SortedMap m)`

### HashTable :
HashTable is a legecy class and implemented by map interface is storing object in key-value pair.

**Q. : Data structure?**  
**Ans :** HashTable

**Q. : Insertion order?**  
**Ans :** Insertion order is not preserved and it is based keys.

**Q. : Null allowed?**  
**Ans :** Not is allowed for both key and Value RE:NPE.

**Q. : Elements?**  
**Ans :** Hetrogeneous object are allowed for both keys and values.

**Q. : Implemented Interface?**  
**Ans :** Serralizable, Clonable and not implement Random Access.

**Q. : Synchronized ?**  
**Ans :** Yes, Every method present in Hashtable is synchronized and HashTable object is thread-safe.

**Q. : Performance?**  
**Ans :** HashTable is best for searching operation.

**Q. : Default Capacity & fill ration?**  
**Ans :** 11 & 0.75

### Constructor :
1. `HashTable()`
2. `HashTable(int initial, float fillration)`
3. `HashTable(int initial)`
4. `HashTable(Map m)`

### HashTable two factory method:
1. `public Enumeration keys()`  
   -> it return enumaration on all keys.
2. `public Enumeration elemets()`  
   -> it return enumeration on all element.

### Properties :
In our program anything we changes frequently(like User-name) not recommanded to hard code in java program if their is any changes to reflect that change recompilation, rebuild, redeploy application are required even sometime server restart also required which create big impact to client.

We can overcome this problem by using properties file such type of variable things we have configure in properties file from properties file into java program and we use those properties.

- The main advantage of this approch is if their is changes in properties file to reflect that changes just redeployment is enough.
- Properties file contain data in (Key, Value) format and this pair is should be string type.

### Constructor :
```java
Properties p = new Properties();
```

### Method :
1. `public String getProperty(String name)`
2. `public String setProperty(String name, String value)`
3. `public ENumeration propertyName()`

### Queue :
Queue is child Inteface of collection interface. If we want represent a group of inidividual Object prior to processing then we should go for Queue.  
It follow first in last out order but based on own requirement we can implement our priority also.

### Queue specific method :
1. `public boolean often(Object o)`  
   -> to add an object into the queue.
2. `public Object poll()`  
   -> to remove and return head element of the queue. If queue is empty then this method return null.
3. `public Object remove()`  
   -> to remove and return head element of the queue. If queue is empty the this method return RE NoSuchElementException.
4. `public Object peek()`  
   -> to return head element of the queue. If queue is empty the this method return null
5. `public Object element()`  
   -> to return head element of the queue. If queue is empty then this method raise Runtime : NoSuchElementException.

### PriorityQueue :
If we want represent group of individual Object prior to processing according to some priority.

- Priority can be Default sorting order or can be customize sorting order.
- Insertion order is not preserved all element should be in some priority.
- Dupliacte are not allowed.
- Null is not allowed.
- Default capacity is 11.

### Constructors :
1. `PriorityQueue()`
2. `PriorityQueue(int initialCapacity)`
3. `PriorityQueue(int inintialcapacity, Comparator c)`
4. `PriorityQueue(SortedSet s)`
5. `PriorityQueue(Collection c)`

---

## Important Differences

### Q. : Difference Between List and Set?
**Ans :**

#### List:
1. In List insertion order is preserved.
2. Duplicate are allowed.

#### Set:
1. In Set insertion order is not preserved.
2. Duplicates are not allowed.

### Q. : Difference Between ArrayList and Vector?
**Ans :**

#### ArrayList :
1. All method in ArrayList is non-synchronized.
2. ArrayList object is Thread-safe.
3. Relatively performance is high.
4. In introduced in Java 1.2V.

#### Vector:
1. All method in vector is synchronized. 
2. Vector object is non-Thread-safe.
3. Relatively performance is low.
4. It introduced in 1.0V. It is also called legecy class.

### Q. : Difference between ArrayList and LinkedList?
**Ans :**

#### ArrayList :
1. It performance is high in retrieving operation.
2. Undelying data structure is growable Array.

#### LinkedList :
1. Its performance is high in inserting and removing in middle of collection.
2. Underlying data structure is double-LinkedList.

### Q. : Difference Between HashSet and LinkedHashSet?
**Ans :**

#### HashSet:
1. In HashSet for storing Object insertion order is not preserved. 
2. It introduced in java 1.2V.

#### LinkedHashSet :
1. In LinkedHashSet for Storing object insertion order is preserved.
2. It introduced in java 1.4V.

### Q. : Difference between ArrayList and HashSet?
**Ans :**

#### ArrayList :
1. In ArrayList insertion order is preserved.
2. Duplicate object are allowed.
3. Underlying data structure is growable array.
4. It is sub class of list.

#### HashSet :
1. In hashSet insertion order is not preserved.
2. Duplicate object are not allowed.
3. Underlying data structure is Hashtable.
4. It is sub class of set.

### Q. : Difference between HashMap and HashTable?
**Ans :**

#### HashMap:
1. All method in HashMap is not-synchronized.
2. It introduced in java 1.2V.
3. Initial capacity of HashMap is 16.

#### HashTable :
1. All method in HashTable is synchronized.
2. It introduced in 1.0V.
3. Initial capacity of HashTable is 11.

### Q. : Difference between Comparable and Comparator?
**Ans :**

#### Comparable :
1. Comparable is used for Default natural sorting order.
2. Comparable is having one method compareTo(-).

#### Comparator :
1. Comparator is used for customized sorting order.
2. Comparator is having two method compare(-,-) and equals(-).

### Q. : Difference between Enumeration and Iterator?
**Ans :**

#### Enumeration:
1. Enumeration is legecy Interface.
2. Enumeration cannot remote element.
3. Enumeration cannot be applied on collection classes directly. It can apply directly on legecy class.
4. By using element() of vector class, we get Enumeration Object.

#### Iterator :
1. Iterator is collection framework Interface.
2. Iterator can remove element.
3. Iterator can be applied on all type of collection classes including legecy classes.
4. By using iterator() of collect, we get Iterator object.

### Q. : Difference between Iterator and ListIterator?
**Ans :**

#### Iterator :
1. Iterator can be applied on collection framework classes.
2. Iterator is Unidirectional means elements retrieved in single direction.  
3. Iterator can only allow is to retrieve and remove element.
4. Iterator is super Interface.

#### ListIterator :
1. ListIterator can be applied only on List Interface implicit classes.
2. ListIterator is bidirectional means elements are retrieved in both directions.
3. ListIterator can allow as to retrieve, insert, remove and also replace element.
4. ListIterator is a sub class of Iterator.

### Generics :
Generics is introduced in java 5 to produce type-safety at compile time and resolve type-cast to avoid classCast Exception.

`(?) -> wild card character`

### Q. : Differenec between new keyword and new instance ?
**Ans :**

#### new keyword :
1. It is operator in java.
2. we can use new operator to create class name add the beginning.

#### new instance :
1. It is method present in java.lang class.
2. we can use this method to create object. If we don't known class name add the begining and it is available dynamically at runtime.

### Q. : Difference between Iterator(Interface) and Iterable(Interface)?
**Ans :**

#### Iterator(Interface):
1. It is related to collections.
2. It is available in java.util package.
3. We can use to retrieve element to collection one by one.

#### Iterable(Interface) :
1. It is related to for each loop.
2. It is available in java.lang package.
3. The target element in for each loop should be Iterable.

### Q. : Difference between print() method and println?
**Ans :**

#### print() :
1. It is used for displaying message on console and placing cursur in the same line. show the next coming message printed in the same line.
2. We have 9 overloaded print methods for displaying all types of values and objects.
3. We do not have no param print method.

#### println :
1. It is also used for displaying message on the console but after println message. It moves cursor next line coming message will be printed in the next line.
2. We have 10 overloaded println methods for displaying all types of values and objects.
3. We have no param println method.

---

## Java 8 features(Streams)

### Collections and Streams :
It we want to represent a group of object as a signal entity we should go for collection.  
If we want to process objects from the Collection-Stream.

### 1) map()
The map method is used to returns a stream consisting of the results of applying the given function to the elements of the stream.

**Example :**
```java
List num = Arrays.asList(2,3,4,5);
List sq = num.stream().map(x -> x*x).collect(Collectors.toList());
```

### 2) filter()
The filter method is used to select elements as per the predicate passed as argument.

**Exmaple :**
```java
List name = Arrays.asList("Reflection", "Collection", "Stream");
List result = name.stream().filter(s -> startWith("S")).collect(Collectors.toList());
```

### 3) sorted()
The Sorted method is used to sort the stream.

**Example :**
```java
List name = Arrays.asList("Reflection", "Collection", "Stream");
List result = name.stream().sorted().collect(Collectors.toList());
```

### Terminal operations:

#### 1) collect()
The collect method is used to iterate through every element element of the stream.

**Example :**
```java
List num = Arrays.asList(2,3,4,5,3);
Set sq = num.stream().map(x -> x*x).collect(Collectors.toSet());
```

#### 2) forEach()
The forEach method is used to iterate through every element of the stream.

**Example :**
```java
List num = Arrays.asList(2,3,4,5);
num.stream().map(x  -> x*x).forEach(x -> System.out.println(x));
```

#### 3) reduce()
The reduce method is used to reduce the elements of a stream to a single value. The reduce method takes a Binary Operator as a parameter.

**Exapmle :**
```java
List num = Arrays.asList(2,3,4,5);
int even = num.stream().filter(x -> x%2 == 0).reduce(o.(ans,i) -> ans + i);
```

### Q. : Main agenda behind Java 8?
**Ans :** Significant reason for introducing java 8 was to introduce concieseness in the code.  
java bring in functional programming which is enable by Lambda expressions[A powerful tool to create concise code base].

### Q. : What is Lambda Expression?
**Ans :** Lambda Expression is an anonymous function [without name, return type and access modifier and having one Lambda (->) symbol].

### Q. : What is functional expression?
**Ans :** Functiona interface are those interfaces which can have only one abstract method.

- It can have any number of static, default mthod No restriction on That.
- There are many functional inetrfaces already present in java such a eg: Comparable, Runnable.

### Q. : What is method reference in java 8?
**Ans :** Method reference is relacement of lambda expressions. It is used to refer method of Functional Inetrface to an Exiting method Mainlly it is used for code reusability. Hence Method reference is an alternative to lambda expression.

### Q. : What are default methods?
**Ans :** Default method is a way for adding new methods to the interface without affecting the implementing classes. Hence with this new feature may people defended many compile time errors that may arise due to unimplemented methods of Interfaces.

- The use of these default methods is "Backword Compatibility" which means If JDK modifies any Interface(without default method) then the classes which implement this Interface will break.

### Q. : How Default method in interface cope up with Diamond problem?
**Ans :** Daimond problem of default methods of inetrface.

- If 2 implemented inetrfaces containes same default methods than thats's the daimond problem. In java, in such situation the code will not compile.

### Q. : What are predicates?
**Ans :** Predicates is predifined functional Interface. [having only 1 abstract method]

- The only abstract method of predicate is test.

### Q. : What is functional Chaining?
**Ans :** We can combine / Chain multiple functions together with and then.

- There are two ways to combine functions:
  i) `f1 and then(f2).apply(Input);`
  ii) `f1.compose(f2).apply(Input);`
```

If you want, I can also give you this as:
1. **clean corrected `.md`**
2. **GitHub README style `.md`**
3. **interview notes `.md` with table of contents**