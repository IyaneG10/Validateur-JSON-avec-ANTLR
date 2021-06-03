#!/bin/bash


antlr4 json.g4

#compilation des fichiers Java
javac *.java

# exécution avec un exemple de fichier
grun json regle_json ..Exemples_json/exemple1.json -gui

