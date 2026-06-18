# Labo 3

## Résumé

- Exécuté les tests des deux classes.
- Complété la majeure partie de la couverture manquante dans la classe `Date`.
- Je n'ai pas pu couvrir la branche manquante à la ligne 109 de la classe `Date`.
    - Certaines branches de la méthode `isEndOfMonth()` sont inaccessibles car
    la validation effectuée par le constructeur dans la méthode `setDay()`
    empêche l'existence d'états de date non valides, rendant ainsi logiquement
    impossible le déclenchement de certaines sous-expressions booléennes de la
    condition.
- Les autres parties ont été entièrement couvertes par les tests que j'ai ajoutés.

```java
if (day == 31 || (day == 30 && isThirtyDayMonth()) ||
                (this.month == 2 && ((day == 29 && leap) || (day == 28 && !leap))))
            return true;
```

## Instructions

Être dans `date` et exécuter `./bin/jacoco`.

## Captures d'écran

### Computation

![](/images/lab03/computation-coverage-before.png)

### Date

Avant

![](/images/lab03/date-coverage-before.png)

Après

![](/images/lab03/date-coverage-after.png)
