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