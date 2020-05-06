# kotlin-jdeploy-playground
use jdeploy / npm to package + distribute java apps

see:

- https://github.com/shannah/jdeploy
- https://sjhannah.com/blog/2017/01/06/use-npm-to-distribute-your-command-line-java-apps/

note:

the distribution does not(!) bundle java - as jpackage does



# (initial) install jdeploy
```
# install jdeploy (globally)
$ npm install -g jdeploy
```

# (initial) build app
```
# create fat jar
$ ./gradlew shadowJar

# create package.json
$ jdeploy init

# install app on local machine 
# just creates symlinks
$ jdeploy install

# run local app
$ kotlin-jdeploy-playground

```

# rebuild app
```
# rebuild
$ ./gradlew shadowJar && jdeploy install

# run local app
$ kotlin-jdeploy-playground

```

# distribute app
```
# distribute app (npm)
$ jdeploy publish

# install the app from npm
$ npm install -g kotlin-jdeploy-playground
```

# the package.json

```
{
  "bin": {
    "kotlin-jdeploy-playground": "jdeploy-bundle/jdeploy.js"
  },
  "author": "",
  "description": "",
  "main": "index.js",
  "preferGlobal": true,
  "repository": "",
  "version": "1.0.0",
  "jdeploy": {
    "jar": "build/libs/kotlin-jdeploy-playground-all.jar"
  },
  "dependencies": {
    "shelljs": "^0.7.5"
  },
  "license": "ISC",
  "name": "kotlin-jdeploy-playground",
  "files": [
    "jdeploy-bundle"
  ],
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1"
  }
}
```
