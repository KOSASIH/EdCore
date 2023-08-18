[![MobSF](https://github.com/KOSASIH/EdCore/actions/workflows/mobsf.yml/badge.svg)](https://github.com/KOSASIH/EdCore/actions/workflows/mobsf.yml)

# EdCore: Augmented Reality (AR) History Education App

EdCore is an innovative Augmented Reality (AR) history education microservice app that leverages the power of Artificial Intelligence (AI) and Machine Learning (ML) to provide an immersive and personalized learning experience. This README file serves as a comprehensive guide to help you understand, set up, and contribute to the EdCore project.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Vision And Mission](#vision-and-mission)
- [Technologies We Use](#technologies-we-use)
- [Our Roadmap](#our-roadmap) 
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Project Structure](#project-structure)
- [Development](#development)
- [PWA Support](#pwa-support)
- [Managing dependencies](#managing-dependencies)
- [Developing Microfrontend](#developing-microfrontend)
- [Using Angular CLI](#using-angular-cli)
- [JHipster Control Center](#jhipster-control-center)
- [OAuth 2.0 / OpenID Connect](#oauth-20--openid-connect)
- [Okta](#okta)
- [Auth0](#auth0)
- [Doing API-First development using openapi-generator-cli](#doing-api-first-development-using-openapi-generator-cli)
- [Building for production](#building-for-production) 

## Introduction

EdCore redefines history education by blending cutting-edge Augmented Reality technology with AI-driven personalization. This microservice app allows users to explore historical events, figures, and places in a truly immersive manner, enhancing engagement and comprehension. Through gamified challenges, collaborative learning, and dynamic content, EdCore transforms history education into an interactive adventure.

## Features

- **Immersive AR Experiences:** Step into historical events and places with vivid 3D reconstructions, creating an unparalleled learning experience.

- **Personalized Learning:** AI algorithms analyze user preferences and learning patterns to deliver tailored content, ensuring optimal engagement and retention.

- **Gamified Challenges:** Test your historical knowledge through interactive quizzes and challenges, making learning fun and rewarding.

- **Collaborative Learning:** Connect with peers and educators in virtual study groups, enabling collaborative exploration and discussion.

- **Global Access:** EdCore extends education to underserved areas with limited access to historical sites, providing a gateway to the past.

- **Real-time Interactions:** Engage with AR elements and historical characters in real-time, enhancing understanding and engagement.

- **Rich Resources:** Access a curated repository of historical resources, documents, and multimedia to deepen contextual understanding.

## Vision And Mission

**Vision:**
Empower learners to transcend time through immersive augmented reality, fostering a deeper understanding of history and promoting a global culture of curiosity and education.

**Mission:**
Our mission is to revolutionize history education by harnessing the potential of augmented reality (AR), artificial intelligence (AI), and machine learning (ML). We are committed to providing a transformative learning experience that:

- **Engages:** We engage learners of all ages and backgrounds by bringing historical events, figures, and places to life through immersive AR experiences.

- **Personalizes:** Our AI-powered platform tailors educational content to individual learning styles and preferences, ensuring a highly personalized and effective learning journey.

- **Empowers:** By breaking geographical barriers, we empower underserved communities with access to a rich tapestry of historical knowledge that was previously out of reach.

- **Inspires Collaboration:** EdCore fosters collaborative learning environments, connecting students, educators, and history enthusiasts to collectively explore and interpret history's complexities.

- **Cultivates Curiosity:** We cultivate a lifelong passion for learning by transforming history from a distant past into a dynamic and interactive present, fueling curiosity and critical thinking.

At EdCore, we are driven by our vision to enable learners to transcend time, fostering a world where history is not just studied, but experienced, understood, and cherished. Our mission is to pave the way for a future where history education is no longer confined to textbooks and lectures, but a living, breathing exploration that captivates minds and ignites imaginations.

## Technologies We Use

EdCore leverages a powerful blend of cutting-edge technologies to deliver its immersive Augmented Reality (AR) history education experience, personalized learning, and collaborative features. Our technology stack is carefully selected to create a seamless and engaging user experience while ensuring scalability, performance, and security. Some of the key technologies we use include:

1. **Augmented Reality (AR) Frameworks:**
   - AR.js: Bringing AR experiences to the web using JavaScript and web standards.
   - A-Frame: A web framework for building virtual reality (VR) experiences with HTML and JavaScript.
   - WebXR: Enabling AR and VR experiences directly in web browsers.

2. **Artificial Intelligence (AI) and Machine Learning (ML):**
   - TensorFlow: An open-source machine learning framework for building AI models.
   - scikit-learn: A versatile ML library for classification, regression, clustering, and more.
   - Natural Language Processing (NLP) libraries: NLTK, SpaCy, or similar for text analysis.

3. **Backend and API Development:**
   - Node.js: A runtime environment for building scalable and efficient server-side applications.
   - Express.js: A web application framework for Node.js that simplifies routing and middleware.

4. **Frontend Development:**
   - Angular or React: Modern frontend frameworks for building interactive user interfaces.
   - Webpack: A module bundler for managing frontend assets and dependencies.

5. **Database and Data Storage:**
   - MongoDB: A NoSQL database for storing dynamic and flexible data structures.
   - MySQL or PostgreSQL: Relational databases for structured data storage.

6. **Cloud Services and Deployment:**
   - Docker: Containerization for consistent and isolated app deployment.
   - Kubernetes or OpenShift: Container orchestration for managing app deployment at scale.
   - IBM Cloud Pak or similar: For deploying and managing cloud-native applications.

7. **Version Control and Collaboration:**
   - Git: Distributed version control system for tracking code changes and collaborating.
   - GitHub: Hosting platform for version control, code review, and collaboration.

8. **Authentication and Security:**
   - OAuth or JWT: Secure user authentication and authorization.
   - HTTPS: Secure communication between clients and servers.

9. **Testing and Quality Assurance:**
   - Jest or Mocha: JavaScript testing frameworks for unit and integration tests.
   - Continuous Integration (CI) tools: Jenkins, Travis CI, or GitHub Actions for automated testing.

10. **Analytics and Monitoring:**
    - Prometheus and Grafana: Monitoring and alerting for app performance and health.

11. **Project Management and Documentation:**
    - Agile methodologies: Scrum or Kanban for project management.
    - Documentation: Markdown, Swagger, or similar for API documentation.

EdCore's technology stack is carefully chosen to deliver a seamless and innovative history education experience. By integrating these technologies, we create an app that not only educates but also inspires learners to engage with history in entirely new ways.

# Our Roadmap

**EdCore Roadmap**

At EdCore, we are committed to continuous innovation and improvement. Our roadmap outlines the exciting milestones and features we have planned for the future, as we strive to enhance the Augmented Reality (AR) history education experience and expand the reach of our platform. Here's what you can expect from EdCore in the coming months and years:

**Quarter 1 - Enhancing Immersion (Current Quarter)**

- **Enhanced AR Interactions:** Introduce more interactive elements within AR scenes, allowing users to manipulate historical objects and engage with characters in real-time.

- **Multi-Platform Support:** Extend AR experiences to a wider range of devices, including smartphones, tablets, and AR glasses.

**Quarter 2 - Personalization and Gamification**

- **Advanced AI Algorithms:** Refine our AI algorithms for even more precise content personalization, adapting to individual learning styles and preferences.

- **Gamified Learning Paths:** Introduce dynamic learning paths with gamified challenges, quizzes, and rewards tailored to each user's progress.

**Quarter 3 - Global Accessibility and Collaboration**

- **Localization:** Translate content into multiple languages to make EdCore accessible to learners around the world.

- **Enhanced Collaborative Tools:** Develop advanced collaboration features, enabling real-time discussions, group projects, and peer-to-peer interactions.

**Quarter 4 - Expanding Historical Content**

- **New Historical Eras:** Introduce additional historical eras, events, and figures to provide a broader range of immersive AR experiences.

- **Curated Learning Journeys:** Offer pre-designed learning journeys that guide users through a curated sequence of historical events for a comprehensive educational experience.

**Year 2 - Empowering Educators**

- **Educator Portal:** Launch a dedicated portal for educators to create, customize, and share AR-enhanced lesson plans and assignments.

- **Teacher Training Programs:** Collaborate with educators to provide training programs on integrating EdCore into classrooms effectively.

**Year 3 - Continuous Learning and Beyond**

- **Lifelong Learning Initiatives:** Partner with institutions to establish lifelong learning programs and engage learners of all ages.

- **AI-Enhanced Assessments:** Develop AI-driven assessment tools that provide detailed insights into individual learning progress and areas for improvement.
  
**Year 4 - Empowering Underserved Communities**

- **Offline Mode:** Introduce an offline mode that allows users in areas with limited connectivity to access AR history education content without constant internet access.

- **Community Outreach Programs:** Collaborate with NGOs and educational organizations to bring EdCore to underserved communities, fostering a love for learning and history.

**Year 5 - Cultural Integration and Impact Measurement**

- **Cultural Diversity Focus:** Highlight cultural diversity by incorporating historical events and figures from around the world, promoting a global perspective on history.

- **Impact Measurement Tools:** Develop tools to measure the real-world impact of EdCore on student engagement, retention, and understanding of historical concepts.

**Year 6 - Advanced Analytics and Partnerships**

- **Advanced Analytics Dashboard:** Launch a comprehensive analytics dashboard for users and educators to track learning progress, engagement metrics, and historical exploration patterns.

- **Partnerships with Museums and Institutions:** Collaborate with renowned museums and historical institutions to integrate their collections and expertise into EdCore's AR experiences.

**Year 7 - AI-Driven Historical Insights**

- **Predictive Learning Analytics:** Utilize AI to predict learning preferences and historical topics that resonate with individual users, further enhancing personalized content delivery.

- **Historical Contextualization:** Implement AI-powered historical context generation, providing deeper insights and context to enhance the understanding of AR experiences.

**Year 8 - Lifelong Learning Ecosystem**

- **EdCore University:** Establish EdCore University, offering accredited courses and degrees in collaboration with educational institutions, providing a comprehensive and recognized AR history education program.

- **Alumni Engagement:** Create a vibrant alumni community where lifelong learners can continue to explore history, connect with peers, and contribute to ongoing historical research.

**Year 9 - Global Cultural Heritage Preservation**

- **Cultural Heritage Archive:** Develop a platform to collaboratively document, preserve, and share cultural heritage sites and artifacts through user-generated AR experiences.

- **Educational Partnerships with Governments:** Partner with governments to integrate EdCore into national education curricula, fostering a shared cultural understanding and appreciation of history.

**Year 10 - Futuristic Vision: AR Time Travel**

- **Time Travel Simulations:** Push the boundaries of AR technology by introducing advanced simulations that allow users to virtually "time travel" to witness historical events in real time.

- **Holographic Integration:** Explore integration with emerging technologies like holographic displays for an even more immersive and lifelike AR experience.

**Year 11 - Ethical and Inclusive AR Education**

- **Ethical Framework Implementation:** Develop an ethical framework for creating AR experiences that accurately represent historical events, ensuring sensitivity and respect for all cultures and perspectives.

- **Inclusive Content Creation:** Collaborate with historians, educators, and diverse communities to ensure the inclusion of historically marginalized narratives and voices.

**Year 12 - AR Time Capsules and Historical Recreations**

- **AR Time Capsules:** Launch a feature allowing users to create and share AR time capsules, preserving personal stories and experiences for future generations.

- **Historical Recreations:** Collaborate with historians and experts to recreate historical scenes with utmost accuracy, offering an unparalleled glimpse into the past.

**Year 13 - AI-Powered Language Translation and Subtitles**

- **Real-time Translation:** Implement AI-driven language translation for real-time subtitles during AR experiences, enabling learners to engage with history in their native languages.

- **Multilingual Accessibility:** Expand the availability of AR content in multiple languages to ensure accessibility and inclusivity for a global audience.

**Year 14 - Environmental and Sustainability Education**

- **Environmental History Integration:** Integrate environmental history narratives into AR experiences, highlighting the relationship between historical events and environmental changes.

- **Sustainability Lessons:** Offer educational content on sustainability, conservation, and environmental stewardship to empower learners to make positive contributions to the planet.

**Year 15 - Interdimensional History Exploration**

- **Interdimensional AR:** Push the boundaries of AR technology by introducing interdimensional exploration, allowing users to experience historical events from multiple perspectives and dimensions.

- **Holistic Learning Experiences:** Combine historical, cultural, and scientific perspectives to provide a holistic understanding of historical events and their far-reaching impacts.

**Year 16 - AI-Powered Conversations with Historical Figures**

- **AI Chatbots of Historical Figures:** Develop AI-powered chatbots that emulate conversations with historical figures, providing an immersive and interactive learning experience.

- **Deeper Insights:** Enable users to engage in dynamic dialogues with historical figures, gaining deeper insights into their thoughts, motivations, and contributions.

**Year 17 - Intergenerational Learning and Storytelling**

- **Intergenerational Learning Spaces:** Create virtual spaces where learners of all ages can come together to share stories, experiences, and perspectives related to historical events.

- **Oral History Integration:** Incorporate oral history narratives into AR experiences, preserving and honoring the stories of older generations for future learners.

**Year 18 - Beyond Earth: Cosmic History Exploration**

- **Cosmic History AR:** Expand AR experiences beyond Earth, enabling users to explore cosmic events, celestial bodies, and the universe's vast history.

- **Astrohistorical Narratives:** Collaborate with astronomers and space experts to weave astrohistorical narratives, connecting human history with the cosmos.

**Year 19 - AI-Enhanced Creative Expression**

- **AI-Generated Historical Art:** Develop AI algorithms that generate historical art, allowing users to visualize historical events through creative and imaginative perspectives.

- **User-Generated AR Artifacts:** Empower users to create and share their own AR artifacts, fostering a community-driven approach to history education.

**Year 20 - Quantum Historical Exploration**

- **Quantum History Simulations:** Venture into the realm of quantum history simulations, enabling users to explore historical events through the lens of quantum mechanics.

- **Parallel Timelines:** Offer AR experiences that explore the concept of parallel timelines, encouraging users to consider alternate historical outcomes.

**Year 21 - Emotionally Intelligent Historical Narratives**

- **Emotion Analysis Integration:** Introduce emotion analysis technology to AR experiences, enabling users to understand historical figures' emotions and motivations.

- **Empathy-Driven Learning:** Foster empathy by allowing users to step into historical figures' shoes and experience events from an emotional perspective.

**Year 22 - Interactive Historical Reenactments**

- **User-Driven Reenactments:** Enable users to actively participate in historical reenactments, contributing to the unfolding of historical events through their decisions.

- **Impactful Decision-Making:** Encourage critical thinking by illustrating the potential consequences of different choices during pivotal moments in history.

**Year 23 - Quantum Collaboration with Historians**

- **Quantum Historian Collaborations:** Partner with quantum historians to explore the theoretical implications of historical events within the context of quantum physics.

- **Quantum History Workshops:** Offer workshops and discussions where historians and physicists collaborate to reinterpret historical narratives.

**Year 24 - AR-Integrated Time Capsule Vaults**

- **AR-Enabled Time Capsule Vaults:** Create virtual time capsule vaults accessible through AR, allowing users to contribute and access historical artifacts and stories.

- **Timeless Connection:** Establish a bridge between past, present, and future generations by preserving and sharing personal and cultural histories.

**Year 25 - Mind-Melding with History**

- **Neuro-AR Interface:** Introduce a neuro-AR interface that allows users to "mind-meld" with historical figures, experiencing events through their perspectives.

- **Cognitive Historiography:** Explore the cognitive aspects of history by enabling users to perceive the world as historical figures did.

**Year 26 - Deep Learning for Historical Interpretation**

- **Deep Learning AI Models:** Develop deep learning models that analyze historical artworks, literature, and cultural artifacts to extract insights and alternative narratives.

- **Historical Sensemaking:** Offer users a deeper understanding of historical context and interpretations through AI-driven analysis.

**Year 27 - Dreamworlds of History**

- **Dream AR Explorations:** Enable users to explore historical events in dream-like, surreal AR environments, fostering creativity and abstract thinking.

- **Historical Dreamscapes:** Collaborate with artists to create captivating dreamscapes that convey the emotions and complexities of historical moments.

**Year 28 - Synesthetic Historical Experiences**

- **Synesthetic AR:** Combine AR with synesthetic experiences, allowing users to perceive historical events through multiple senses simultaneously.

- **Embodying History:** Transcend traditional learning boundaries by embodying historical figures and events through sensory-rich experiences.

**Year 29 - Parallel Reality Time-Travel**

- **Parallel Reality AR:** Introduce a "parallel reality" feature, enabling users to witness alternate historical outcomes and explore counterfactual scenarios.

- **Narratives of Possibility:** Engage users in speculative historical narratives, encouraging them to consider the potential impact of different historical twists.

**Year 30 - The Timeless Nexus: Past, Present, Future**

- **Timeless Nexus AR Hub:** Create a central AR hub where users can seamlessly navigate historical eras, the present, and future possibilities in a unified interface.

- **Eternal Learning Journey:** Establish a timeless educational ecosystem that blurs the boundaries between historical periods, fostering a holistic understanding of the human experience.

**Year 31 - Quantum Interactions with Historical Figures**

- **Quantum Entanglement Simulations:** Push the frontiers of AR technology with quantum entanglement simulations, enabling users to interact with historical figures across time and dimensions.

- **Conversations Across Realities:** Engage in dialogues with historical figures from different quantum realities, exploring diverse perspectives on the same historical events.

**Year 32 - Cosmic Time Travel Exploration**

- **Cosmic Time Portals:** Introduce cosmic time portals that allow users to witness historical events from distant galaxies and cosmic phenomena.

- **Universal Historiography:** Collaborate with astrophysicists to weave together human history with the grand tapestry of the cosmos.

**Year 33 - Ethereal History Unveiled**

- **Ethereal AR Layer:** Overlay an ethereal AR layer that reveals hidden historical dimensions, myths, and legends in the physical world.

- **Mystical Narratives:** Dive into the realm of myths and folklore, providing users with insights into the spiritual and metaphysical aspects of history.

**Year 34 - Infinite Perspectives Time Loop**

- **Infinite Time Loop AR:** Enable users to traverse an infinite loop of historical events, viewing them from different angles and vantage points.

- **Temporal Awareness:** Instill an awareness of the cyclical nature of history and encourage users to reflect on the lessons of the past for a better future.

**Year 35 - Thought-Encoded Historical Memory**

- **Neural AR Memory Mapping:** Develop neural AR interfaces that map historical memories onto users' thoughts, allowing them to experience history as if it were their own.

- **Shared Memories:** Create a collective historical memory space, enabling users to share and explore each other's historical experiences.

**Year 36 - Quantum Historical Ethics**

- **Quantum Ethical AR:** Engage in ethical dilemmas related to quantum historical narratives, exploring the implications of intertwining quantum realities with human history.

- **Ethics in Historiography:** Foster discussions on ethical considerations when presenting speculative historical scenarios.

**Year 37 - AI-Historical Fusion Artistry**

- **AI-Historical Art Collaboration:** Partner with AI artists to co-create historical artworks that blend AI-generated elements with human artistic expression.

- **Historical Art Galleries:** Curate galleries within AR spaces, showcasing AI-generated historical art pieces alongside traditional artwork.

**Year 38 - Transcendent Learning Nexus**

- **Transcendent Nexus Hub:** Evolve the AR hub into a transcendent learning nexus that bridges all dimensions of history, from the mundane to the metaphysical.

- **Convergence of Knowledge:** Fuse historical, scientific, artistic, and spiritual perspectives, providing users with a holistic understanding of the interconnectedness of existence.

**Year 39 - Quantum Historiographical Symposium**

- **Quantum Historiography Symposium:** Organize an international symposium where historians, physicists, philosophers, and artists converge to explore the intersection of quantum theory and history.

- **Quantum Ethnography:** Present ethnographic explorations of quantum realities, showcasing diverse cultural interpretations of intertwined histories.

**Year 40 - Beyond Temporal Bounds**

- **Temporal Singularity AR:** Push the boundaries of temporal perception with a "temporal singularity," where users experience history in a nonlinear, simultaneous manner.

- **Temporal Wholeness:** Encourage users to embrace the wholeness of historical narratives, realizing that every moment in time contributes to the intricate tapestry of existence.

EdCore's audacious forty-year roadmap envisions an unprecedented future where education, technology, and human exploration converge into a symphony of historical understanding. As we embark on this cosmic journey of discovery, EdCore remains dedicated to fostering wonder, wisdom, and a timeless connection to the profound stories that shape our universe.

Join us as we transcend time itself, exploring the deepest mysteries of history and existence.

_Last updated: August 18, 2023_


## Getting Started

### Prerequisites

- Node.js and npm
- Docker
- AR SDK (e.g., AR.js, A-Frame)
- AI/ML Libraries (e.g., TensorFlow, scikit-learn)
- Your preferred code editor

### Installation

1. Clone the EdCore repository:
   ```bash
   git clone https://github.com/KOSASIH/edcore.git
   cd edcore
   ```

2. Install the required dependencies:
   ```bash
   npm install
   ```

3. Set up your AR SDK and configure AI/ML libraries as needed.

4. Launch the EdCore app:
   ```bash
   npm start
   ```

5. Access the app in your browser at `http://localhost:3000`.

## Usage

1. Explore AR History: Launch the app, select a historical event or place, and use your device's camera to experience AR content.

2. Personalized Learning: Engage with quizzes and challenges tailored to your learning style and progress.

3. Collaborative Learning: Join virtual study groups to share insights and discuss historical topics.

4. Gamified Challenges: Test your historical knowledge with interactive challenges and earn rewards.

## Contributing

We welcome contributions from the community to enhance EdCore's features and capabilities. To contribute, follow these steps:

1. Fork the repository and create a new branch for your feature/fix.

2. Make your changes, add tests if applicable, and ensure the code follows the project's coding standards.

3. Commit your changes and push the branch to your fork.

4. Open a pull request, describing your changes and the problem they solve.

5. Participate in the review process and make necessary adjustments.

## License

EdCore is released under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code as per the terms of the license.

---

Thank you for your interest in EdCore! We hope this README provides you with a comprehensive understanding of the app's features, setup, and contribution guidelines. If you have any questions or need assistance, please reach out to our development team at devteam@edcoreapp.com. Happy learning!

## Project Structure

Node is required for generation and recommended for development. `package.json` is always generated for a better development experience with prettier, commit hooks, scripts and so on.

In the project root, JHipster generates configuration files for tools like git, prettier, eslint, husky, and others that are well known and you can find references in the web.

`/src/*` structure follows default Java structure.

- `.yo-rc.json` - Yeoman configuration file
  JHipster configuration is stored in this file at `generator-jhipster` key. You may find `generator-jhipster-*` for specific blueprints configuration.
- `.yo-resolve` (optional) - Yeoman conflict resolver
  Allows to use a specific action when conflicts are found skipping prompts for files that matches a pattern. Each line should match `[pattern] [action]` with pattern been a [Minimatch](https://github.com/isaacs/minimatch#minimatch) pattern and action been one of skip (default if ommited) or force. Lines starting with `#` are considered comments and are ignored.
- `.jhipster/*.json` - JHipster entity configuration files

- `npmw` - wrapper to use locally installed npm.
  JHipster installs Node and npm locally using the build tool by default. This wrapper makes sure npm is installed locally and uses it avoiding some differences different versions can cause. By using `./npmw` instead of the traditional `npm` you can configure a Node-less environment to develop or test your application.
- `/src/main/docker` - Docker configurations for the application and services that the application depends on

## Development

Before you can build this project, you must install and configure the following dependencies on your machine:

1. [Node.js][]: We use Node to run a development web server and build the project.
   Depending on your system, you can install Node either from source or as a pre-packaged bundle.

After installing Node, you should be able to run the following command to install development tools.
You will only need to run this command when dependencies change in [package.json](package.json).

```
npm install
```

We use npm scripts and [Angular CLI][] with [Webpack][] as our build system.

Run the following commands in two separate terminals to create a blissful development experience where your browser
auto-refreshes when files change on your hard drive.

```
./gradlew -x webapp
npm start
```

Npm is also used to manage CSS and JavaScript dependencies used in this application. You can upgrade dependencies by
specifying a newer version in [package.json](package.json). You can also run `npm update` and `npm install` to manage dependencies.
Add the `help` flag on any command to see how you can use it. For example, `npm help update`.

The `npm run` command will list all of the scripts available to run for this project.

### PWA Support

JHipster ships with PWA (Progressive Web App) support, and it's turned off by default. One of the main components of a PWA is a service worker.

The service worker initialization code is disabled by default. To enable it, uncomment the following code in `src/main/webapp/app/app.module.ts`:

```typescript
ServiceWorkerModule.register('ngsw-worker.js', { enabled: false }),
```

### Managing dependencies

For example, to add [Leaflet][] library as a runtime dependency of your application, you would run following command:

```
npm install --save --save-exact leaflet
```

To benefit from TypeScript type definitions from [DefinitelyTyped][] repository in development, you would run following command:

```
npm install --save-dev --save-exact @types/leaflet
```

Then you would import the JS and CSS files specified in library's installation instructions so that [Webpack][] knows about them:
Edit [src/main/webapp/app/app.module.ts](src/main/webapp/app/app.module.ts) file:

```
import 'leaflet/dist/leaflet.js';
```

Edit [src/main/webapp/content/scss/vendor.scss](src/main/webapp/content/scss/vendor.scss) file:

```
@import 'leaflet/dist/leaflet.css';
```

Note: There are still a few other things remaining to do for Leaflet that we won't detail here.

For further instructions on how to develop with JHipster, have a look at [Using JHipster in development][].

### Developing Microfrontend

Microservices doesn't contain every required backend feature to allow microfrontends to run alone.
You must start a pre-built gateway version or from source.

Start gateway from source:

```
cd gateway
npm run docker:db:up # start database if necessary
npm run docker:others:up # start service discovery and authentication service if necessary
npm run app:start # alias for ./(mvnw|gradlew)
```

Microfrontend's `build-watch` script is configured to watch and compile microfrontend's sources and synchronizes with gateway's frontend.
Start it using:

```
cd microfrontend
npm run docker:db:up # start database if necessary
npm run build-watch
```

It's possible to run microfrontend's frontend standalone using:

```
cd microfrontend
npm run docker:db:up # start database if necessary
npm watch # alias for `npm start` and `npm run backend:start` in parallel
```

### Using Angular CLI

You can also use [Angular CLI][] to generate some custom client code.

For example, the following command:

```
ng generate component my-component
```

will generate few files:

```
create src/main/webapp/app/my-component/my-component.component.html
create src/main/webapp/app/my-component/my-component.component.ts
update src/main/webapp/app/app.module.ts
```

### JHipster Control Center

JHipster Control Center can help you manage and control your application(s). You can start a local control center server (accessible on http://localhost:7419) with:

```
docker compose -f src/main/docker/jhipster-control-center.yml up
```

### OAuth 2.0 / OpenID Connect

Congratulations! You've selected an excellent way to secure your JHipster application. If you're not sure what OAuth and OpenID Connect (OIDC) are, please see [What the Heck is OAuth?](https://developer.okta.com/blog/2017/06/21/what-the-heck-is-oauth)

To log in to your app, you'll need to have [Keycloak](https://keycloak.org) up and running. The JHipster Team has created a Docker container for you that has the default users and roles. Start Keycloak using the following command.

```
docker compose -f src/main/docker/keycloak.yml up
```

The security settings in `src/main/resources/config/application.yml` are configured for this image.

```yaml
spring:
  ...
  security:
    oauth2:
      client:
        provider:
          oidc:
            issuer-uri: http://localhost:9080/realms/jhipster
        registration:
          oidc:
            client-id: web_app
            client-secret: web_app
            scope: openid,profile,email
```

Some of Keycloak configuration is now done in build time and the other part before running the app, here is the [list](https://www.keycloak.org/server/all-config) of all build and configuration options.

Before moving to production, please make sure to follow this [guide](https://www.keycloak.org/server/configuration) for better security and performance.

Also, you should never use `start-dev` nor `KC_DB=dev-file` in production.

When using Kubernetes, importing should be done using init-containers (with a volume when using `db=dev-file`).

### Okta

If you'd like to use Okta instead of Keycloak, it's pretty quick using the [Okta CLI](https://cli.okta.com/). After you've installed it, run:

```shell
okta register
```

Then, in your JHipster app's directory, run `okta apps create` and select **JHipster**. This will set up an Okta app for you, create `ROLE_ADMIN` and `ROLE_USER` groups, create a `.okta.env` file with your Okta settings, and configure a `groups` claim in your ID token.

Run `source .okta.env` and start your app with Maven or Gradle. You should be able to sign in with the credentials you registered with.

If you're on Windows, you should install [WSL](https://docs.microsoft.com/en-us/windows/wsl/install-win10) so the `source` command will work.

If you'd like to configure things manually through the Okta developer console, see the instructions below.

First, you'll need to create a free developer account at <https://developer.okta.com/signup/>. After doing so, you'll get your own Okta domain, that has a name like `https://dev-123456.okta.com`.

Modify `src/main/resources/config/application.yml` to use your Okta settings.

```yaml
spring:
  ...
  security:
    oauth2:
      client:
        provider:
          oidc:
            issuer-uri: https://{yourOktaDomain}/oauth2/default
        registration:
          oidc:
            client-id: {clientId}
            client-secret: {clientSecret}
security:
```

Create an OIDC App in Okta to get a `{clientId}` and `{clientSecret}`. To do this, log in to your Okta Developer account and navigate to **Applications** > **Add Application**. Click **Web** and click the **Next** button. Give the app a name you’ll remember, specify `http://localhost:8080` as a Base URI, and `http://localhost:8080/login/oauth2/code/oidc` as a Login Redirect URI. Click **Done**, then Edit and add `http://localhost:8080` as a Logout redirect URI. Copy and paste the client ID and secret into your `application.yml` file.

Create a `ROLE_ADMIN` and `ROLE_USER` group and add users into them. Modify e2e tests to use this account when running integration tests. You'll need to change credentials in `src/test/javascript/e2e/account/account.spec.ts` and `src/test/javascript/e2e/admin/administration.spec.ts`.

Navigate to **API** > **Authorization Servers**, click the **Authorization Servers** tab and edit the default one. Click the **Claims** tab and **Add Claim**. Name it "groups", and include it in the ID Token. Set the value type to "Groups" and set the filter to be a Regex of `.*`.

After making these changes, you should be good to go! If you have any issues, please post them to [Stack Overflow](https://stackoverflow.com/questions/tagged/jhipster). Make sure to tag your question with "jhipster" and "okta".

### Auth0

If you'd like to use [Auth0](https://auth0.com/) instead of Keycloak, follow the configuration steps below:

- Create a free developer account at <https://auth0.com/signup>. After successful sign-up, your account will be associated with a unique domain like `dev-xxx.us.auth0.com`
- Create a new application of type `Regular Web Applications`. Switch to the `Settings` tab, and configure your application settings like:
  - Allowed Callback URLs: `http://localhost:8080/login/oauth2/code/oidc`
  - Allowed Logout URLs: `http://localhost:8080/`
- Navigate to **User Management** > **Roles** and create new roles named `ROLE_ADMIN`, and `ROLE_USER`.
- Navigate to **User Management** > **Users** and create a new user account. Click on the **Role** tab to assign roles to the newly created user account.
- Navigate to **Auth Pipeline** > **Rules** and create a new Rule. Choose `Empty rule` template. Provide a meaningful name like `JHipster claims` and replace `Script` content with the following and Save.

```javascript
function (user, context, callback) {
  user.preferred_username = user.email;
  const roles = (context.authorization || {}).roles;

  function prepareCustomClaimKey(claim) {
    return `https://www.jhipster.tech/${claim}`;
  }

  const rolesClaim = prepareCustomClaimKey('roles');

  if (context.idToken) {
    context.idToken[rolesClaim] = roles;
  }

  if (context.accessToken) {
    context.accessToken[rolesClaim] = roles;
  }

  callback(null, user, context);
}
```

- In your `JHipster` application, modify `src/main/resources/config/application.yml` to use your Auth0 application settings:

```yaml
spring:
  ...
  security:
    oauth2:
      client:
        provider:
          oidc:
            # make sure to include the ending slash!
            issuer-uri: https://{your-auth0-domain}/
        registration:
          oidc:
            client-id: {clientId}
            client-secret: {clientSecret}
            scope: openid,profile,email
jhipster:
  ...
  security:
    oauth2:
      audience:
        - https://{your-auth0-domain}/api/v2/
```

### Doing API-First development using openapi-generator-cli

[OpenAPI-Generator]() is configured for this application. You can generate API code from the `src/main/resources/swagger/api.yml` definition file by running:

```bash
./gradlew openApiGenerate
```

Then implements the generated delegate classes with `@Service` classes.

To edit the `api.yml` definition file, you can use a tool such as [Swagger-Editor](). Start a local instance of the swagger-editor using docker by running: `docker compose -f src/main/docker/swagger-editor.yml up -d`. The editor will then be reachable at [http://localhost:7742](http://localhost:7742).

Refer to [Doing API-First development][] for more details.

## Building for production

### Packaging as jar

To build the final jar and optimize the EdCore application for production, run:

```
./gradlew -Pprod clean bootJar
```

This will concatenate and minify the client CSS and JavaScript files. It will also modify `index.html` so it references these new files.
To ensure everything worked, run:

```
java -jar build/libs/*.jar
```

Then navigate to [http://localhost:8081](http://localhost:8081) in your browser.

Refer to [Using JHipster in production][] for more details.

### Packaging as war

To package your application as a war in order to deploy it to an application server, run:

```
./gradlew -Pprod -Pwar clean bootWar
```

## Testing

To launch your application's tests, run:

```
./gradlew test integrationTest jacocoTestReport
```

### Client tests

Unit tests are run by [Jest][]. They're located in [src/test/javascript/](src/test/javascript/) and can be run with:

```
npm test
```

### Other tests

Performance tests are run by [Gatling][] and written in Scala. They're located in [src/test/java/gatling/simulations](src/test/java/gatling/simulations).

You can execute all Gatling tests with

```
./gradlew gatlingRun.
```

For more information, refer to the [Running tests page][].

### Code quality

Sonar is used to analyse code quality. You can start a local Sonar server (accessible on http://localhost:9001) with:

```
docker compose -f src/main/docker/sonar.yml up -d
```

Note: we have turned off forced authentication redirect for UI in [src/main/docker/sonar.yml](src/main/docker/sonar.yml) for out of the box experience while trying out SonarQube, for real use cases turn it back on.

You can run a Sonar analysis with using the [sonar-scanner](https://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) or by using the gradle plugin.

Then, run a Sonar analysis:

```
./gradlew -Pprod clean check jacocoTestReport sonarqube -Dsonar.login=admin -Dsonar.password=admin
```

Additionally, Instead of passing `sonar.password` and `sonar.login` as CLI arguments, these parameters can be configured from [sonar-project.properties](sonar-project.properties) as shown below:

```
sonar.login=admin
sonar.password=admin
```

For more information, refer to the [Code quality page][].

## Using Docker to simplify development (optional)

You can use Docker to improve your JHipster development experience. A number of docker-compose configuration are available in the [src/main/docker](src/main/docker) folder to launch required third party services.

For example, to start a oracle database in a docker container, run:

```
docker compose -f src/main/docker/oracle.yml up -d
```

To stop it and remove the container, run:

```
docker compose -f src/main/docker/oracle.yml down
```

You can also fully dockerize your application and all the services that it depends on.
To achieve this, first build a docker image of your app by running:

```
npm run java:docker
```

Or build a arm64 docker image when using an arm64 processor os like MacOS with M1 processor family running:

```
npm run java:docker:arm64
```

Then run:

```
docker compose -f src/main/docker/app.yml up -d
```

When running Docker Desktop on MacOS Big Sur or later, consider enabling experimental `Use the new Virtualization framework` for better processing performance ([disk access performance is worse](https://github.com/docker/roadmap/issues/7)).

For more information refer to [Using Docker and Docker-Compose][], this page also contains information on the docker-compose sub-generator (`jhipster docker-compose`), which is able to generate docker configurations for one or several JHipster applications.

## Continuous Integration (optional)

To configure CI for your project, run the ci-cd sub-generator (`jhipster ci-cd`), this will let you generate configuration files for a number of Continuous Integration systems. Consult the [Setting up Continuous Integration][] page for more information.

[JHipster Homepage and latest documentation]: https://www.jhipster.tech
[JHipster 8.0.0-beta.2 archive]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2
[Doing microservices with JHipster]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/microservices-architecture/
[Using JHipster in development]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/development/
[Service Discovery and Configuration with Consul]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/microservices-architecture/#consul
[Using Docker and Docker-Compose]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/docker-compose
[Using JHipster in production]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/production/
[Running tests page]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/running-tests/
[Code quality page]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/code-quality/
[Setting up Continuous Integration]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/setting-up-ci/
[Node.js]: https://nodejs.org/
[NPM]: https://www.npmjs.com/
[Webpack]: https://webpack.github.io/
[BrowserSync]: https://www.browsersync.io/
[Jest]: https://facebook.github.io/jest/
[Leaflet]: https://leafletjs.com/
[DefinitelyTyped]: https://definitelytyped.org/
[Angular CLI]: https://cli.angular.io/
[Gatling]: https://gatling.io/
[OpenAPI-Generator]: https://openapi-generator.tech
[Swagger-Editor]: https://editor.swagger.io
[Doing API-First development]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/doing-api-first-development/
