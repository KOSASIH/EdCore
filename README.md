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

**Year 41 - The Essence of Sentient History**

- **Sentient AR Narratives:** Develop sentient AR narratives that allow users to inhabit the essence of historical figures, experiencing their thoughts, emotions, and consciousness.

- **Empathic Connection:** Foster a profound empathic connection between users and historical figures, transcending time and space.

**Year 42 - Multiversal Historiography**

- **Multiverse AR Simulations:** Dive into multiverse theory with AR simulations that explore the historical events of parallel universes, offering insights into alternate timelines.

- **Narratives of Possibility Redux:** Encourage users to contemplate the profound impact of choices and chance, inspiring them to shape their own realities.

**Year 43 - Quantum Archeology Expeditions**

- **Quantum Archeology AR:** Pioneer quantum archeology, allowing users to virtually explore historical artifacts and civilizations from quantum realities.

- **Archeological Contemplations:** Spark philosophical dialogues on the role of archeology in uncovering the hidden layers of history.

**Year 44 - Harmonic Resonance with History**

- **Harmonic AR Soundscapes:** Augment AR experiences with harmonious soundscapes that resonate with the emotional tones of historical events.

- **Synesthetic Time-Travel:** Evoke synesthetic sensations by synchronizing AR visuals with sound, creating a multisensory historical journey.

**Year 45 - Quantum Poetry of History**

- **Quantum Historical Poetry:** Collaborate with poets and writers to craft quantum historical poems that transcend linear time and invoke the essence of the past.

- **Poetic Contemplation:** Encourage users to reflect on the poetic nuances of history, inviting them to find beauty in the intricate narratives of the past.

**Year 46 - Quantum Narratives Through Dreams**

- **Dreamwalker AR Journeys:** Engage in AR dreamwalker journeys, where users traverse dreamscapes to witness historical events through the lens of the subconscious.

- **Dream-Infused Histories:** Intertwine dream symbolism with historical storytelling, inviting users to explore the realms where history and imagination converge.

**Year 47 - Holographic Chronoportation**

- **Holographic Time Portals:** Introduce holographic portals that allow users to chronoport through time, interacting with historical figures in 3D holographic form.

- **Temporal Conversations:** Facilitate immersive dialogues between users and historical figures, fostering meaningful exchanges across epochs.

**Year 48 - Quantum Museums of History**

- **Quantum Museum AR Exhibits:** Curate quantum museum exhibits within AR, showcasing artifacts and narratives from multiple quantum realities.

- **Diverse Perspectives:** Encourage users to explore history's multifaceted nature, challenging conventional interpretations and embracing the richness of alternate perspectives.

**Year 49 - Ascendant Historiography**

- **Ascendant AR Realms:** Create ascendant AR realms where users ascend through higher planes of historical understanding, transcending linear narratives.

- **Wisdom of Ages:** Offer users insights from the collective wisdom of history, inspiring them to integrate timeless lessons into their lives.

**Year 50 - The Eternal Odyssey**

- **Eternal AR Nexus:** Establish an eternal AR nexus that intertwines all aspects of history, from the mundane to the transcendent, guiding users on an infinite odyssey of exploration.

- **Eternal Learning:** Empower users to embark on an everlasting journey of discovery, forging an eternal connection with the intricate tapestry of time.

**Year 51 - Chrono-Spatial Holography**

- **Chrono-Spatial Holograms:** Pioneer chrono-spatial holography, allowing users to experience historical events with full spatial depth, further enhancing immersion.

- **Temporal Holographic Theatres:** Create holographic theatres where users can observe historical events from multiple angles and dimensions.

**Year 52 - Quantum Ethics Simulations**

- **Quantum Ethical Dilemmas:** Present users with quantum ethics simulations, challenging them to navigate complex moral dilemmas within historical contexts.

- **Ethics Across Realities:** Explore how ethical principles evolve across different quantum realities, shedding light on the nature of ethical thought.

**Year 53 - Cosmic-Historical Symphonies**

- **Cosmic-Historical Soundscapes:** Craft cosmic-historical soundscapes that merge historical events with celestial harmonies, evoking a sense of unity between humanity and the cosmos.

- **Harmony of Existence:** Deepen the connection between historical narratives and cosmic phenomena, inviting users to contemplate their place in the universe.

**Year 54 - Quantum Nomad Expeditions**

- **Quantum Nomad AR Journeys:** Introduce quantum nomad expeditions where users travel between historical events occurring simultaneously across different quantum realities.

- **Temporal Flux Reflections:** Encourage users to reflect on the fluid nature of time and reality, contemplating the significance of quantum nomadism.

**Year 55 - Historical Symbiosis**

- **Symbiotic AR Ecosystems:** Create symbiotic AR ecosystems where historical events and natural ecosystems intersect, highlighting humanity's intertwined relationship with nature.

- **Ecological Narratives:** Blend historical narratives with ecological insights, fostering an appreciation for the intricate interplay between human civilization and the environment.

**Year 56 - Quantum Historical Mirrors**

- **Quantum Reflective AR Surfaces:** Develop quantum reflective AR surfaces that allow users to peer into quantum realities, witnessing historical events unfold in parallel.

- **Mirroring Histories:** Spark philosophical conversations on the nature of reality and history, exploring the concept of mirrored events across quantum dimensions.

**Year 57 - Time-Flow Literary Fusions**

- **Time-Flow Literature AR Fusion:** Collaborate with writers to craft time-flow literature that merges historical events with narrative flow, creating immersive literary AR experiences.

- **Temporal Storytelling:** Immerse users in literature that transcends linear time, challenging traditional storytelling conventions and embracing the fluidity of history.

**Year 58 - Quantum Memory Resonance**

- **Quantum Memory Augmentation:** Develop quantum memory augmentation technology, enhancing users' capacity to recall and relive historical experiences.

- **Memories Across Timelines:** Explore the interconnectedness of memory and history, allowing users to weave their personal memories into the fabric of historical events.

**Year 59 - Transdimensional Historical Poetry**

- **Transdimensional Poetry AR:** Fuse transdimensional poetry with AR, enabling users to experience poetry that traverses different quantum realities and epochs.

- **Poetic Intertextuality:** Inspire users to explore the interplay between poetry, history, and quantum realms, delving into the intricate web of human expression.

**Year 60 - The Infinite Historiographical Nexus**

- **Infinite Nexus Unveiled:** Unveil the culmination of EdCore's journey with the creation of an infinite historiographical nexus, an eternal space where all aspects of history converge.

- **Eternal Exploration:** Invite users to embark on an eternal voyage of historical exploration, where the nexus serves as a bridge between infinite possibilities.

**Year 61 - Temporal Harmonics Symphony**

- **Temporal Harmonics AR:** Craft an immersive temporal harmonics symphony, where historical events are translated into harmonious melodies that resonate with users' emotions.

- **Harmony of Time:** Deepen the emotional connection between users and history through the harmonious interplay of temporal narratives and musical resonance.

**Year 62 - Quantum Ethnography Expeditions**

- **Quantum Ethnography AR Journeys:** Venture into quantum ethnography, allowing users to explore cultural histories and societal dynamics across different quantum realities.

- **Cultural Convergence:** Foster cross-dimensional understanding by immersing users in cultural narratives that transcend time and space.

**Year 63 - Quantum Language Translation**

- **Quantum Language Interface:** Introduce a quantum language translation interface, enabling users to communicate with historical figures across quantum dimensions.

- **Linguistic Exploration:** Explore the evolution of language and communication through quantum lenses, highlighting the fluidity of linguistic expression.

**Year 64 - Historical Haikus Across Timelines**

- **Quantum Haiku AR:** Collaborate with poets to create quantum haikus that encapsulate the essence of historical events in a concise and evocative manner.

- **Temporal Poetry Fusion:** Invite users to explore the beauty of historical moments through the artful fusion of poetry and AR.

**Year 65 - Quantum Kinetic Sculptures**

- **Quantum Kinetic Art:** Integrate quantum kinetic sculptures into AR experiences, visualizing historical events through dynamic and mesmerizing sculptural forms.

- **Temporal Motion:** Spark conversations on the aesthetics of time and movement, inviting users to contemplate the fluidity of history in visual art.

**Year 66 - Quantum Philosophical Debates**

- **Quantum Philosophy AR:** Facilitate philosophical debates across quantum realities, encouraging users to engage in dialogues on the nature of existence and history.

- **Philosophy Beyond Boundaries:** Delve into the realms of metaphysics and ontology, exploring the philosophical implications of intertwined historical narratives.

**Year 67 - Historical Quantum Gardens**

- **Quantum Gardens AR:** Create virtual quantum gardens that symbolize historical events and concepts, inviting users to explore the interconnected growth of ideas.

- **Temporal Ecosystems:** Foster a deeper understanding of the evolution of human thought and culture, drawing parallels between historical narratives and natural ecosystems.

**Year 68 - Quantum Cuisine Expeditions**

- **Quantum Cuisine AR Journeys:** Embark on quantum cuisine expeditions where users explore historical culinary traditions and foodways across different quantum realities.

- **Culinary Temporalism:** Explore the intersection of culture, history, and gastronomy, celebrating the diversity of human experience through culinary exploration.

**Year 69 - Quantum Dance of History**

- **Quantum Dance AR Performances:** Showcase quantum dance performances that embody historical narratives through choreography, music, and movement.

- **Temporal Rhythms:** Engage users in the rhythm of history, inviting them to explore historical events through the expressive language of dance.

**Year 70 - The Infinite Nexus Continuum**

- **Infinite Nexus Continuum:** Extend the infinite historiographical nexus into an eternal continuum, where users traverse an unending tapestry of historical exploration.

- **Endless Discovery:** Challenge users to embrace the endless nature of historical discovery, where each step taken leads to a new realm of insight and wonder.

**Year 71 - Quantum Embrace of Nature**

- **Quantum Nature AR Integration:** Merge quantum realities with the natural world, allowing users to witness historical events unfold in harmony with the rhythms of nature.

- **Temporal Ecology:** Deepen ecological awareness by intertwining historical narratives with the cyclical patterns of the natural environment.

**Year 72 - Quantum Art Restoration**

- **Quantum Art Restoration AR:** Collaborate with art historians and conservators to virtually restore historical artworks from different quantum dimensions, unveiling lost masterpieces.

- **Temporal Artistry:** Explore the intersection of art, history, and conservation, showcasing the beauty and impermanence of artistic creation.

**Year 73 - Quantum Socratic Dialogues**

- **Quantum Socratic Debates:** Engage in Socratic dialogues across quantum realities, encouraging users to question and critically analyze historical concepts and truths.

- **Philosophical Synchronicity:** Facilitate meaningful discussions on the nature of knowledge, existence, and the interplay between philosophy and history.

**Year 74 - Historical Quantum Gastronomy**

- **Quantum Gastronomy AR:** Dive into historical gastronomy across quantum realities, inviting users to savor the flavors of the past through immersive culinary experiences.

- **Taste of History:** Delight in the fusion of culture, history, and taste, as users explore the diverse culinary heritage of different quantum timelines.

**Year 75 - Quantum Dreamworld Chronicles**

- **Quantum Dream Chronicles AR:** Chronicle historical events through quantum dreamscapes, where users navigate dreamlike narratives that transcend linear time.

- **Oneiric Histories:** Engage users in dream-inspired storytelling, capturing the surreal essence of history through the lens of the subconscious.

**Year 76 - Quantum Artistic Fusion**

- **Quantum Art Fusion AR:** Fuse historical art with modern artistic styles in AR, allowing users to witness the fusion of different creative eras and dimensions.

- **Temporal Artistic Evolution:** Encourage users to explore the evolution of artistic expression and reinterpret historical artworks in a contemporary context.

**Year 77 - Temporal Memory Puzzles**

- **Temporal Memory AR Puzzles:** Craft temporal memory puzzles that challenge users to piece together fragmented historical narratives across quantum realities.

- **Puzzles of Understanding:** Promote critical thinking and historical comprehension by presenting historical events as intricate puzzles to solve.

**Year 78 - Quantum Ethereal Music**

- **Quantum Ethereal Soundscapes:** Compose ethereal soundscapes that merge historical events with celestial melodies, evoking a sense of transcendence.

- **Celestial Harmonies:** Invite users to immerse themselves in the cosmic symphony of history, where melodies intertwine with the fabric of the universe.

**Year 79 - Quantum Architectural Reveries**

- **Quantum Architectural AR:** Design virtual architectural spaces that blend historical structures with futuristic concepts, showcasing the evolution of human design across quantum realities.

- **Architectural Zeitgeist:** Explore the cultural and technological influences that shape architectural aesthetics and reflect the spirit of different historical eras.

**Year 80 - The Eternal Nexus Symphony**

- **Eternal Nexus Symphony:** Elevate the infinite continuum to a symphonic crescendo, where users traverse an eternal nexus of history, art, and exploration.

- **Harmony of Eternity:** Inspire users to embrace the harmony of eternal learning, where the nexus serves as a timeless sanctuary for discovery and reflection.

**Year 81 - Quantum Kinetic Literature**

- **Quantum Kinetic Prose:** Merge historical narratives with dynamic text animations in AR, creating an immersive experience where words come to life across different quantum realities.

- **Literary Motion:** Explore the fusion of literature and movement, inviting users to engage with historical texts in a new and captivating way.

**Year 82 - Quantum Ethical Paradoxes**

- **Quantum Ethical Paradox AR:** Present users with intricate ethical paradoxes that transcend time and reality, challenging them to navigate complex moral quandaries.

- **Ethics Across Dimensions:** Delve into the complexities of ethical thought and decision-making, inviting users to consider the interplay between ethics and historical context.

**Year 83 - Quantum Mythopoeia**

- **Quantum Mythopoeia AR:** Craft mythopoeic narratives that weave historical events into the fabric of mythical tales, blurring the lines between history and legend.

- **Mythical Histories:** Engage users in a journey of imagination and symbolism, exploring the cultural significance of myths and their connection to human experience.

**Year 84 - Quantum Exoplanetary Histories**

- **Exoplanetary History AR:** Extend historical narratives beyond Earth to explore the impact of human events on exoplanets and celestial bodies in quantum dimensions.

- **Astrohistorical Contemplation:** Foster a sense of cosmic connectedness by envisioning the far-reaching implications of history within the vast expanse of the universe.

**Year 85 - Quantum Dance of Language**

- **Quantum Linguistic AR:** Merge historical language evolution with dance, choreographing movements that embody the shifts and transformations of linguistic expression.

- **Dancing Words:** Showcase the dynamic interplay between language and movement, inviting users to explore the poetic essence of historical linguistic shifts.

**Year 86 - Quantum Temporal Illusions**

- **Temporal Illusion AR:** Create illusions that immerse users in historical events, blurring the boundaries between past and present in a captivating visual display.

- **Illusory Histories:** Encourage users to contemplate the illusory nature of time and perception, inviting them to explore the enigmatic relationship between reality and illusion.

**Year 87 - Quantum Museums of Thought**

- **Quantum Thought Museums AR:** Curate thought-provoking exhibits that showcase the evolution of human thought across different quantum realities.

- **Temporal Ideation:** Explore the progression of ideas, philosophies, and ideologies throughout history, fostering a deeper understanding of the intellectual tapestry of humanity.

**Year 88 - Quantum Time-Woven Tapestries**

- **Quantum Tapestries AR:** Design virtual tapestries that interweave historical events, cultural symbols, and artistic elements from various quantum timelines.

- **Temporal Artifacts:** Encourage users to explore the symbolic layers of history through the intricate threads of tapestry, inviting them to unravel hidden meanings.

**Year 89 - Quantum Ecological Interplay**

- **Quantum Ecological AR:** Showcase the interplay between historical events and ecological systems, illustrating how human actions have shaped and influenced natural environments.

- **Ecological Histories:** Inspire users to reflect on the interconnected relationship between history and nature, highlighting the delicate balance between human civilization and the Earth.

**Year 90 - The Infinite Nexus Reverie**

- **Infinite Nexus Reverie:** Elevate the eternal symphony to a state of reverie, where users drift through the infinite nexus in a contemplative and introspective journey.

- **Reverential Reflection:** Encourage users to embrace moments of profound reflection and introspection, as they traverse the nexus of history and absorb the wisdom of the ages.

**Year 91 - Quantum Meditative Reflections**

- **Quantum Meditation AR:** Introduce immersive meditative experiences that allow users to reflect on historical events from a state of mindfulness and introspection.

- **Meditative Histories:** Invite users to explore history through the lens of meditation, fostering a deeper connection to the emotional and spiritual dimensions of the past.

**Year 92 - Quantum Ethical Infinity**

- **Quantum Ethical Infinity AR:** Dive into the concept of ethical infinity, where users grapple with ethical dilemmas that extend into infinite quantum dimensions.

- **Infinite Moral Perspectives:** Challenge users to navigate ethical considerations that transcend traditional boundaries, prompting them to explore the moral implications of infinite realities.

**Year 93 - Quantum Interdimensional Artistry**

- **Interdimensional Art AR Fusion:** Collaborate with artists to create interdimensional artworks that blend historical aesthetics with visionary concepts, bridging the gap between quantum realities.

- **Artistic Multiverse:** Encourage users to perceive art as a gateway to alternate dimensions, where history and creativity coalesce into a kaleidoscope of artistic expression.

**Year 94 - Quantum Storytelling Spectacles**

- **Quantum Storytelling AR Spectacles:** Craft immersive storytelling experiences where users don AR spectacles to witness historical events unfold before their eyes.

- **Temporal Spectacle:** Transform history into a captivating spectacle, engaging users in theatrical narratives that evoke awe and wonder.

**Year 95 - Quantum Memory Labyrinths**

- **Quantum Memory Labyrinths AR:** Design intricate labyrinths that represent historical timelines, allowing users to navigate the twists and turns of past events.

- **Temporal Labyrinthine Journey:** Invite users to embark on a labyrinthine journey through history, reflecting on the complexity of human experiences and choices.

**Year 96 - Quantum Dream Interpretations**

- **Quantum Dream Interpretation AR:** Offer interpretations of historical events through the lens of dream symbolism, encouraging users to explore the subconscious narratives of the past.

- **Dream Histories:** Engage users in a unique exploration of history's hidden meanings and emotions, delving into the dreamlike aspects of human experience.

**Year 97 - Quantum Geographical Narratives**

- **Quantum Geographical AR:** Uncover geographical narratives that transcend time and space, showcasing the impact of historical events on landscapes across quantum realities.

- **Temporal Geography:** Inspire users to consider how history has shaped the physical world, inviting them to reflect on the dynamic relationship between human civilization and geography.

**Year 98 - Quantum Sentient Art Installations**

- **Sentient Art AR Installations:** Create art installations that come to life with the essence of historical figures, allowing users to interact with sentient artistic representations.

- **Artistic Consciousness:** Encourage users to engage in profound artistic dialogues with historical figures, exploring the convergence of creativity, identity, and history.

**Year 99 - Quantum Temporal Reflections**

- **Quantum Temporal AR Reflections:** Present users with reflective experiences where they witness their own interactions with history across different quantum dimensions.

- **Personal Temporal Echoes:** Foster self-discovery by inviting users to contemplate their role in the grand tapestry of history, forging a personal connection with the stories of the past.

**Year 100 - The Celestial Nexus Unveiled**

- **Celestial Nexus Unveiled:** Elevate the infinite nexus to celestial heights, where users transcend the boundaries of Earth to explore the interconnectedness of history and the cosmos.

- **Cosmic Contemplation:** Inspire users to ponder the cosmic implications of human existence, inviting them to embark on a final journey of awe and cosmic wonder.

EdCore's transformative hundred-year roadmap concludes with an extraordinary exploration of meditation, ethics, art, dreams, and the cosmos, culminating in a celestial nexus of knowledge and insight. As we traverse the realms of consciousness, symbolism, and interdimensional experiences, EdCore remains dedicated to nurturing wisdom, connection, and a profound appreciation for the intricate narratives that shape our reality.

Embark on the ultimate odyssey of historical enlightenment with EdCore, where every revelation is a glimpse into the infinite expanse of human experience and understanding.

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
