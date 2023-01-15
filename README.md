[![](https://jitpack.io/v/boldangel/Conversor-Objeto-JSON.svg)](https://jitpack.io/#boldangel/Conversor-Objeto-JSON)

# Conversor-Objeto-JSON

Converta objetos e listas (primitivas ou de objetos) em json.

### Instalação

#### 1) Inclua o suporte do jitpack no seu arquivo gradle no nível do projeto.
```
allprojects { 
    repositórios { 
        maven { url 'https://jitpack.io' }
    } 
}}
```

##### 2) Inclua a dependência gradle no arquivo build.gradle (Lembre-se de colocar a versão mais atual).
```
dependencies {
  implementation 'com.github.boldangel:Conversor-Objeto-JSON:v1.0-beta'
}
```

# Uso

##### Classe exemplo:
```
private class Professor{
  private String nome;
  private String materia;

  public Professor(String nome, String materia) {
    this.nome = nome;
    this.materia = materia;
  }
}
```

##### Em seguida:
```
String resJson = new LISTparaJSON(listExample).getListaConvertidaParaJSON();
```

### Resultado:
![resultado no logcat](https://i.ibb.co/CKhj9dV/Capturar.png)

#### Para converter de objeto para json, só usar:
```
String resJson = new ObjetoParaJSON(SeuObjetoAqui).retornaStringObjetoGenerico();
```
