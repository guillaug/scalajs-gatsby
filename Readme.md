# ScalaJS-gatsby

Quick trial. Don't use it for something serious. Quite slow.

## Installation

### Gatsby

```
cd gatsby
gatsby develop
```

### ScalaJS

Uses [Slinky](https://slinky.dev)

```
cd scalajs
sbt ~bundle
```

## How it works

This is only a proof of concept.

1. Compiles ```scala``` files and exports a single JS file using ```scala-bundler``` (fastOptJS)
2. Single JS file is copied to ```gatsby/src``` folder
3. Gatsby takes over and reloads the site

```js
// gatsby/src/index.js
import { Components } from "../scalajs-gatsby-fastopt"
const { MyComponent } = Components

const IndexPage = () =>
    <Layout>
      <SEO title="Home" />
      <h1>Hi people</h1>
      <MyComponent name="Gatbsy" />
      <p>Welcome to your new Gatsby site.</p>
      <p>Now go build something great.</p>
      <div style={{ maxWidth: `300px`, marginBottom: `1.45rem` }}>
        <Image />
      </div>
      <Link to="/page-2/">Go to page 2</Link>
    </Layout>
```

```MyComponent``` is written in ```scala``` using ```slinky```.
It is a React Component that Gatsby can render.

## Issues

_Reloading takes time : not less than 10+ seconds betweek scala files edit and gatbsy site update_
