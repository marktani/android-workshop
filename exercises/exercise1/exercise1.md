---
title: 'Übung 1 - Native App-Entwicklung: Android'
author: 'Nilan Marktanner<br>, nilan.marktanner@gmail.com'
date: '<br>25. Januar 2017'
header-includes:
    - \usepackage{fancyhdr}
    - \pagestyle{fancy}
    - \fancyhead[L]{Übung 1}
    - '\fancyhead[C]{Native App-Entwicklung: Android}'
    - \fancyhead[R]{25. Januar 2017}

abstract: |
# Entwicklungsumgebung einrichten, eigenständige Einarbeitung in Android
lang: german
numbersections: true
---

*In diesem Übungsblatt werden wir die Entwicklungsumgebung und Konzepte von Android entdecken.*

*Dieses Übungsblatt wird während des ersten Kurstermins bearbeitet.*

# Entwicklungsumgebung einrichten

## Android Studio
*Android Studio* ist die offizielle Entwicklungsumgebung (IDE) zur Entwicklung für Android. Folgen Sie den [Installationsanweisungen](http://developer.android.com/sdk/installing/index.html) und laden Sie [Android Studio](http://developer.android.com/sdk/index.html) und das [*JDK 8*](http://www.oracle.com/technetwork/java/javase/downloads/index.html) herunter.
Falls Sie bereits eine frühere Version von Android Studio oder dem JDK installiert haben ist das auch ausreichend. Um Kompatibilitätsprobleme zu vermeiden sind aber mindestens Android Studio 2.0 und JDK 8 empfohlen. Achten Sie auch auf die Aktualisierung der Pakete im [SDK Manager](http://developer.android.com/tools/help/sdk-manager.html).

## Ausführen von Apps
Apps können entweder direkt am PC in einem *Emulator* ausgeführt werden oder zunächst auf ein Smartphone gespielt werden, das dann als Testgerät dient. In dieser Aufgabe erstellen Sie ihr erstes Android Projekt und führen es zunächst im Emulator aus um sicher zu gehen, dass ihr System korrekt eingerichtet ist. Danach richten Sie optional Ihr Android Smartphone für die Android Entwicklung ein.

### Das erste Android Projekt
Erstellen Sie in Android Studio ein neues Projekt. In sämtlichen Schritten des Projekt-Wizards können die Standardwerte verwendet werden. Weitere Informationen zur Projekterstellung befinden sich [hier](http://developer.android.com/training/basics/firstapp/creating-project.html).

### Apps im Emulator ausführen
Android Studio beinhaltet bereits einen Emulator. Um zu überprüfen, ob Android Studio und Java korrekt eingerichtet sind, führen Sie nun das Projekt aus, indem Sie auf den grünen Pfeil klicken oder Run -> Run 'app' auswählen. Dies sollte zu einem Dialogfenster führen, in dem Sie den Emulator auswählen und starten. Nun sollte sich der Emulator öffnen und der Boot-Dialog von Android erscheinen. Nach einiger Zeit öffnet sich eine App mit der Überschrift "Main Activity". Falls das nicht der Fall ist, beheben Sie mögliche Fehlermeldungen und wiederholen Sie den Vorgang. Mehr Informationen zum Android Emulator befinden sich [hier](http://developer.android.com/tools/devices/emulator.html).

### Apps auf dem Smartphone ausführen
Das Testen einer App auf dem Smartphone hat neben einer erheblich höheren Performanz auch noch den Vorteil, dass reale Sensor- und Netzwerkdaten verfügbar sind. (Nicht nur) für diesen Kurs wird deshalb diese Variante empfohlen. Voraussetzung dazu ist ein Android Smartphone und ein gewöhnliches Daten-/Ladekabel. Folgen Sie dazu [dieser Anleitung](http://developer.android.com/training/basics/firstapp/running-app.html#RealDevice).

Das Ausführen auf dem Smartphone ist analog zum Ausführen mit dem Emulator. Nachdem Sie das Smartphone mit dem PC verbunden haben wählen Sie dazu beim Auswahldialog statt dem Emulator das Smartphone aus. Falls das Handy nicht erkannt wird, stellen Sie sicher, dass der *Developer Modus* auf dem Handy aktiviert ist. Unter Windows sind meist auch gerätespezifische Treiber notwendig, damit das Handy erkannt wird.

# Einarbeitung in die Android Entwicklung
Arbeiten Sie sich nun mit diesen Materialien weiter in die Android Entwicklung ein. Achten Sie dabei eher auf ein grundlegendes Verständnis der Zusammenhänge als auf Detailwissen. Diese Themen werden erneut im Kurs angesprochen.

## Lektüre
* [Introduction to Android](http://developer.android.com/guide/index.html)
* [Application Fundamentals](http://developer.android.com/guide/components/fundamentals.html)
* [Activities](http://developer.android.com/guide/components/activities.html)

## Fortsetzung des Android Projekts
Bearbeiten Sie die folgende Aufgaben indem Sie das vorher erstellte Projekt fortsetzen.

* [Building a Simple User Interface](http://developer.android.com/training/basics/firstapp/building-ui.html)
* [Starting Another Activity](http://developer.android.com/training/basics/firstapp/starting-activity.html)

Android Apps werden in Java entwickelt. Sie sollten daher mit den Schlüsselwörtern und der Syntax von Java vertraut sein.

# Weitere Informationen
Beim Entwickeln von Software treten oft Fragen, Probleme oder Diskussionsbedarf auf. Folgende Webseiten sind für Sie als Android Entwickler in solchen Fällen hilfreich:

* [Android Developer Bereich](http://developers.android.com): Hier findet man Dokumentation zu allen Android Klassen, Anleitungen und Artikeln zu Konzepten, die in Android verwendet werden und Vorschläge zur Heransgehensweise an häufige Aufgabenstellungen, die bei der Android Entwicklung aufkommen. Möchte man sich über eine bestimmte Klasse oder ein bestimmtes Konzept von Android näher informieren ist dies eine gute Anlaufstelle.
* [Stack Overflow](http://stackoverflow.com): Frage-Antwort-Community. Meist findet man hier zu einem eigenen Problem bereits die gestellte Frage und mehrere gute Ansätze. Falls nicht, kann man seine eigene Frage stellen und auf Hilfe hoffen.
* [Codepath Github](https://github.com/codepath/android_guides/wiki): umfangreiche Sammlung von Codebeispielen für die verschiedensten Anwendungsfälle.

Gewöhnen Sie sich an, diese und andere Möglichkeiten zu nutzen, falls Sie an einer Stelle nicht mehr selber weiterkommen. Nutzen Sie auch im Kurs die Möglichkeit, Hilfe vom Kursleiter und von Kommilitonen zu erhalten.
