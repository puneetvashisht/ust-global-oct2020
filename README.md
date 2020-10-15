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
        - Pass values from parent to child using  [] - property binding
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

    