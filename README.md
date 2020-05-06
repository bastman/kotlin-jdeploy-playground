# kotlin-jdeploy-playground
use jdeploy / npm to package + distribute java apps

see:

- https://github.com/shannah/jdeploy
- https://sjhannah.com/blog/2017/01/06/use-npm-to-distribute-your-command-line-java-apps/

# install jdeploy
```
# install jdeploy (globally)
$ npm install -g jdeploy
```

# build app
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

# distribute app
```
# distribute app (npm)
$ jdeploy publish

# install the app from npm
$ npm install -g kotlin-jdeploy-playground
```
