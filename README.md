# Nalu examples
To help you to understand how the framework works, Nalu comes with some examples.

To run the examples:

* clone the repository

* run ```mvn clean``` & ```mvn gwt:devmode```

* copy the link and paste the link into the browser url

Please, keep in mind, Nalu ist a client side framework, so all server calls are simulated on the client side and are mocked in these examples. Because of that, there is no need for a server side implementation. Also, Nalu does not force you to use a special widget lib. This is up to you. In this examples we use native Elemental 2, Elemento, [Domino-UI](https://github.com/DominoKit/domino-ui) and native GWT widgets.

Most of the examples have three screens (seach screen, result list and a detail screen.

## NaluDominoCachedApplication
This example demonstrates the chaching feature. To see how the caching feature works, search for names containing an 'S' or 'D'. On the list screen, turn on caching, select a person and edit the data. Press save to get the changes saved. Once back on the list, you'll see, that the data is not updated (Cause Nalu uses the chached screen). After pressing reload, you will see the updates.

## NaluDominoLoginApplication
This example demonstrates an easy way how to implement a login feature. Once the aplication gets started, you will see a login screen (you can enter any user and password). After the login you can navigate throw the applicaiton cause the user is marked as logge in (inside the context). Press relaod and you will not get to the bookmared page. Instead, you will be redirected to the login screen because the context is new created and the information that the user i logged in gets lost. 

This examples has also an error page implemented. To see the error page, change something inside the hash. If this is an invalid route, the error page will appear. 

This example uses three different shells and the composite feature. (detail screen)

## NaluDominoLoginPluginApplication
This example works in the same way like the NaluDominoLoginApplication example, but uses a plugin for the login classes and error classes.

## NaluDominoSimpleApplication
This example uses Domino-UI to implement the components You can navigatge between those screens, update data, etc. This example uses the Nalu-Plugin-Elemental2 and DominoUI as widget library. 

The Domino example is deployed on the mvp4g server. The deployed version can be found [here](http://www.mvp4g.org/NaluDominoSimpleApplication-1.0.0/index.html).

## NaluElementoSimpleApplication
The Elemento example is similar to the Domino example, except that is uses Elemento instead of Domino-UI as widget library. This example uses the Nalu-Plugin-Elemental2. 

## NaluGwtSimpleApplication
The native GWT example is similar to the Elemento example, except that is uses native GWT widgets. This example uses the Nalu-Plugin-GWT. 

## NaluGxtSimpleApplication
The GXT example is a mail box simulation using GXT 4.0 widgets. This example uses the Nalu-Plugin-GWT. 

## NaluMaterialSimpleApplication
This example uses the GWT Material widgets and uses the Nalu-Plugin-Elemental2. 

## Notes

Some things are nonsens and only implemented to show some features of Nalu.

For example: 
* If Bart Simpson is selected from the list, the application will route to the search view. This is the desired behavior: f. e.: see [BartSimpsonFilter-class](https://github.com/nalukit/nalu-examples/blob/master/NaluDominoSimpleApplication/src/main/java/de/gishmo/gwt/example/nalu/simpleapplication/client/filters/BartSimpsonFilter.java) for more informations.
