---
title: 'Übung 3 - Native App-Entwicklung: Android'
author: 'Nilan Marktanner<br>, nilan.marktanner@gmail.com'
date: '<br>26. Januar 2017'
header-includes:
    - \usepackage{fancyhdr}
    - \pagestyle{fancy}
    - \fancyhead[L]{Übung 3}
    - '\fancyhead[C]{Native App-Entwicklung: Android}'
    - \fancyhead[R]{26. Januar 2017}

abstract: |
# Konzepte von Android, Projektstruktur, Verhalten von Activities
lang: german
numbersections: true
---

# Hello Kitty

Die Idee ist es, ein zufälliges Katzenbild von der CatAPI abzufragen und anzuzeigen. Bei Betätigung eines Buttons soll ein weiteres Zufallsbild angezeigt werden.

# Vorbereitung

* Lesen Sie die Dokumentation der [Cat API](http://thecatapi.com/docs.html) durch. Sie benötigen keinen API Key.

* Wir verwenden den Endpoint `http://thecatapi.com/api/images/get`

* Das Format das wir erhalten wollen ist `xml`. Daher verwenden wir  `http://thecatapi.com/api/images/get?format=xml`

* [Hier](https://github.com/marktani/HelloKitty/archive/master.zip) erhalten ein vorbereitetes Projekt. Machen Sie sich zunächst mit den Klassen vertraut. Sie können die App auch kompilieren und ausführen. Beachten Sie dabei die Log-Ausgaben.

* Um die Bilddateien herunterzuladen und zu cachen, verwenden wir [Picasso](http://square.github.io/picasso/). Um es dem Projekt hinzuzufügen fügen Sie die Zeile `compile 'com.squareup.picasso:picasso:2.5.2'` in die build.gradle des Moduls `app` ein.

* Um das erhaltene Bild anzuzeigen benötigen wir einen [ImageView]( http://developer.android.com/reference/android/widget/ImageView.html).

* Mit Picasso können wir direkt den ImageView mit einem Bild befüllen.

# RecyclerView

Einzelne Katzenbilder sind langweilig! Deswegen möchten wir nun eine Liste von Bildern einbauen. Dazu verwenden wir einen [RecyclerView](http://developer.android.com/reference/android/support/v7/widget/RecyclerView.html).

Befolgen Sie im Wesentlichen dieses [Tutorial](https://github.com/codepath/android_guides/wiki/Using-the-RecyclerView).

* Als LayoutManager verwenden Sie einen `LinearLayoutManager`, einen `ItemAnimator` benötigen wir nicht. Als Model verwenden Sie die `Image`-Klasse, die bereits angelegt ist.

* Der erste Schritt im Tutorial, den Sie anpassen müssen ist das Erstellen eines eigenen Layouts unter der Überschrift `Creating the Custom Row Layout`. Überlegen Sie sich, was für Elemente für jedes Katzenbild benötigt wird und strukturieren Sie dementsprechend das Layout.

* Als nächstes benötigen wir unseren eigenen `RecyclerView.Adapter`. Wir nennen diesen `ImageAdapater`. Dieser verwaltet eine Liste von `Images`. Legen Sie diese Liste an. Lesen Sie den Beispielcode im Abschnitt `Creating the RecyclerView.Adapter` und passen Sie diesen an unsere Situation an. Dies ist die Hauptaufgabe dieses Übungsblattes.

* Als letzter Schritt müssen wir den Adapter an den RecyclerView binden. Folgen Sie der Anleitung mit der Überschrift `Binding the Adapter to the RecyclerView`.
