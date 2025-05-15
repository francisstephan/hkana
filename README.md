#Hkana

`hkana` is a port to Clojurescript of my `hiragana` Clojure program, based on the [instaparse](https://github.com/engelberg/instaparse) parser generator ("Context-Free Grammars as Easy as Regular Expressions").

Watch live at [https://www.eludev.fr/hkana](https://www.eludev.fr/hkana)

#Clojurescript project scaffolding

Six years ago I had initially built the project using leiningen and figwheel. Coming back to it in 2025, I had to conclude that lein-figwheel had become overly complex and that the project.clj configuration file was hard to manage.

Finally I found a bootstrapping solution for the project with [Create CLJS App](https://github.com/filipesilva/create-cljs-app).

## Available Scripts

In the project directory, you can run:

### `yarn start`

Runs the app in development mode.<br>
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.
The page will reload if you make edits.

### `yarn build`

Builds the app for production to the `public` folder.<br>
It bundles all code and optimizes the build for the best performance.
