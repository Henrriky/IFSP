# Criacionais

## Factory

## Abstract factory

## Builder

## Prototype

## Singleton

# Estruturais

## Adapter

- É um padrão de projeto que permite a compatibilidadade entre objetos com interfaces incompatíveis
    - Exemplo: 
        - Interface WindowListener do Java e WindowsAdapter
        - Solução: WindowsAdapter é uma classe abstrata que implementa Interface Adapter
- Solução Geral:
```ts
class Target {
    public request(): string {
        return "Target: Default Target Behavior"
    }
}

class Adaptee {
    public specificRequest(): string {
        return "sla"
    }
}

class Adapter extends Adaptee {

    private adaptee: Adaptee

    constructor(adaptee: Adaptee) {

    }


}
```

## Bridge

- O bridge permite que um a gente divida uma classe grande ou um conjunto de classes ou intimamente ligadas em duas hierarquias separadas:abstração e implementação



## Composite

- O padrão composite permite o agrupamento de objetos através de estrutura de árvores e use eles como se fossem objetos individuais

```ts
interface Graphic {
    public move(x: number, y: number)
    public draw()
}

class Dot implements Graphic {

    private x: string
    private y: string

    constructor(x: number, y: number) {

    }

    public move(x: number, y: number) {

    }
    public draw() {

    }
}

class Circle extends Dot {

    private radius: string

    constructor(x: number, y: number, radius: string) {
        super(x, y)
        this.radius = radius
    }

    public draw() {

    }
}

class CompoundGraphic implements Graphic {

    private children: Array<Graphic>


    public function add (g: Graphic) {
        this.children.push(g)
    }

    public function remove (g: Graphic) {
        this.children.filter((graphic) => {
            return !(graphic === g)
        })
    }

    public function move (x: string, y: string) {
        children.forEach(graphic => {
            graphic.move(x, y)
        })
    }

    public draw () {

    }
}

class ImageEditor {

    private all: CompoundGraphic

    public load() {
        all = new CompoundGraphic()
        all.add(new Dot(1, 2))
        all.add(new Circle(5, 3, 10))
    }

    public groupSelected(components: Graphic[]) {
        let group = new CompoundGraphic()
        foreach (component in components) {
            group.add(component)
            all.remove(component)
        }
        all.add(group)
        all.draw()
    }
}
```


## Decorator

- Padrão de projeto que permite o acoplamento de novos comportamentos para objetos ao colocar eles dentro de invólucros que contém comportamentos

```ts

class Notifier {

    public send(message) {

    }
}

class BaseDecorator implements Notifier {

    private wrapper: Notifier

    constructor(notifier: Notifier) {
        this.wrapper = notifier
    }

    public send(message: string) {
        this.wrapper.send(message)
    }
}

class SMSDecorator extends BaseDecorator {

    public send(message: string) {
        super.send(message)
        this.sendSMS(message)
    }

    public sendSMS (message: string) {
        console.log("Sending Notification via SMS")
    }

}   

class FacebookDecorator extends BaseDecorator {

    public send(message: string) {
        super.send(message)
        this.sendFacebook(message)
    }

    public sendFacebook (message: string) {
        console.log("Sending Notification via Facebook")
    }

}   



```



## Facade

- O padrão facade permite uma maior simplicidade na composição de um conjunto complexo de classes, através de uma interface simplificada para uma biblioteca, framework ou várias regras de negócio complexas de um sistema.

```ts
class VideoFile {

}
class OggCompressionCodec {

}

class MPEG4CompressionCodec {

}

class CodecFactory {

}



```

## Flyweight

## Proxy

- O padrão proxy permite que a gente forneça um substituto ou espaço reservado para outro objeto. Ele controla o acesso ao objeto original, permitindo manipulações posteriores ou anteriores antes de chegar nele.

```ts

interface ServiceInterface {
    public operation(): string
}

class Service implements ServiceInterface {

    public operation() {
        return "Doing any business logic"
    }
}

class AuthenticationProxy implements ServiceInterface {

    private realService: Service

    constructor (s: Service) {
        this.realService = s;
    }

    public function checkAccess() {
        return true
    }

    public function operation () {
        if (checkAccess()) {
            return this.realService.operation()
        }
    }
}

const service = new Service() 
const proxy = new AuthenticationProxy(service)
console.log(proxy.operation())
```

# Comportamentais

# LINKS

- Core J2EE Patterns
- POSA (Douglas)
- Design Patterns (GOF)