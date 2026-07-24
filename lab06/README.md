# Labo 6

## Instructions

Être dans `BookstoreApp/` et exécuter `mvn test`.

## Test supplémentaire

```java
@Test
public void administratorSignIn() {
    driver.navigate().to("http://localhost:8080/admin");
    assertEquals("http://localhost:8080/login", driver.getCurrentUrl());

    WebElement loginBtn = driver.findElement(By.id("loginBtn"));
    assertEquals("Sign in", loginBtn.getAttribute("value"));

    WebElement loginField = driver.findElement(By.id("loginId"));
    loginField.sendKeys("admin");

    WebElement passwdField = driver.findElement(By.id("loginPasswd"));
    passwdField.sendKeys("password");

    loginBtn.click();

    assertEquals("http://localhost:8080/admin", driver.getCurrentUrl());
    WebElement form = driver.findElement(By.tagName("form"));
    assertEquals("search-category-admin-form", form.getAttribute("id"));
}
```

## Captures d'écran

### L'application

#### Home

![](/images/lab06/en-home.png)

![](/images/lab06/fr-home.png)

#### Login

![](/images/lab06/en-login.png)

![](/images/lab06/fr-login.png)

#### Admin

![](/images/lab06/en-admin.png)

![](/images/lab06/fr-admin.png)

### Résultats des tests

![](/images/lab06/test-results1.png)

![](/images/lab06/test-results2.png)
