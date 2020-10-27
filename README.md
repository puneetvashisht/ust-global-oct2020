    Angular
        - 1. Install NodeJS -- NPM (Node Package Manager)
        - 2. Install some utilities with NPM
        - tsc compiler to convert typescript code into js code.. that run in browser
        - 3. Try and run typescript -- convert it into JS for running on the browser
    Angular CLI Steps
        - npm install -g angular-cli
        - ng new my-first-app
        - cd my-first-app
        - ng serve
    Create Angular Components 
        - .ts -- contains a class annotated as @Component 
        - Template or view
    CRUD
        - Components to create, read, update and delete an entity - Employee
        - Http communication using GET, POST, DELETE
        - JSON Web SErver
            - npm init - create a package.json
            - npm i json-server - creates a dependency in package.json
            - db.json 
            - json-server --watch db.json
            https://www.npmjs.com/package/json-server
        - Create component: ng generate component <component-name> : ng g c
        - Create service: ng generate service <service-name> : ng g s
    Nested Component 
        - Parent and child components
        - Pass values from parent to child using  
        {{}} - Interpolation - reading from .ts to html
        [] - property binding - input
        () - Event binding - outputs
        [(ngModel)] - two way binding
        - Pass values from child to parent () - event binding
    Single Page Application
        - How to it in Angular
        - Routing Module, Define Path for pages, Linking
        - Route Parameters
        - Programmatic Navigation
        - Page not found -- Redirect
        - Nested Routes
    Services
        - Dependency Injection
        - Http alternatives
    Pipes
        - Formating/Filtering your data
    Form Validation
        - Reactive/Data-driven form validation
            - Import ReactiveFormsModule
            - FormGroups -> FormControl in both template and ts
            - Validators or custom validations
        - Template-Driven
            - simple scenarios
    Angular Material 
        - Already built in components
    Angular Build
        - ng build [--prod]
        - Angular build process is different from Java
        - Angular CLI depends on Webpack(bundler) to create build

    -- Coding Assignment
    Discussion forum (Post -> Comments*) as Single Page Application
    Use JSON Server as backend simulation
    1. View All Posts (Table of all posts - link for detailed) - Search on posts --> filters
    2. Detailed view of a post -- showing all comments
    3.  Add Post  - Form validations
    4. Comments can be added from Detailed view screen
    Design is Angular Material -- fallback using Angular Bootstrap

    Testing
        - Unit Testing
        - Jasmine/Mocha testing library
        - Write .spec test case
        - Test runner - karma
        - Configuration file for karma


    -------------------- JAVA -----------------------
    Eclipse setup
    Java OOPS
        1. Inheritance
            a. Code Reuse
            b. Polymorphism
        2. Polymorphism
        3. Abstraction
        4. Encapsulation
    Casting 
        Upcasting is default, downcast is explicitly needed
        a. Primitives
        b. Reference types - supertypes can hold subtypes objects, explicit cast needed.

    LSP - Liskov's Substitution Principle
    Car is a Vehicle
    Manager is a Employee
    3D is a 2D --  (favour composition over inheritance)

      Department has an Employee
    Employee has a Address

    Bicycle (maxSpeed) -> RoadBicyle (speedUp-> speed +2 ) & MountainBycle (speedUp-> speed +1)

    Garbage Collection
    Collections 
    Equals, Sorting (Comparable -- natural criteral,same class & Comparator -- other criterias, different class)
        List (ArrayList, LinkedList)
        Set (HashSet(unordered), LinkedHashSet(insertion order), TreeSet(sorted))
    Hashing - indexing based on hashcode
    Contract b/w equas() & hashcode() -> Objects which are equal must produce same hashcode, vice-versa is not true.

    Exception Handling
    String 



    SBA

    Employee class contains following fields : id, firstName, lastName, age, salary 
    
    1. Create a printEmployees method that can
    - Print all employees
    - Print employees with firstName starting with letter 'R'
    - Print employees with lastName starting with letter 'C'
    - Print the employee with minimum salary
    - Print the sum of all salaries of the employees
    - Print the average of salaries of employees
    - Print sorted list of employees with salaries (both ascending and descending)
    The method returns EmployeeNotFound exception whereever the result is empty.


    2. Extend the employee to create Regular & Contract Employees
        Implement incrementSalary() to increase salary by 5% of current salary for Regular Employees & Rs 5000/- fixed for contractual Employees
    
    3. Create a Nested collections representing a cached objects

    Map<String bankName, Bank bank>   - Bank (bankId, bankName, List<Branch> branches, List<Atm> atms)
    Branch (branchId, branchName, Address address, Atm atm)
    Atm (atmID, Address address)
    Address (addressId, location, city, pincode)

    findAllAtmAndBranches(String bank, String location)
    findAllAtmAndBranches(String bank, int pincode)


    Java 8
        Functional Interfaces
        Lamdas
        Pedicates, Consumer, BiConsumers, Suppliers..... Java 8 FI
        Stream - Declarative style of programming
        Parallel Streams
        Collectors - Joining, Partitioning, Grouping, Summarizing
        Method, Constructor References
        Optional - Wrapper avoiding NullPointerExceptions
        Date Time API
            Local Date Time
            Zone Date Time
            Insant
    OOAD




