# LLMStudio Android Client App
Simple client app for LLM studio to access LLM hosted locally via LM studio built on MVVM architecture


**Done**
- Simple chat

**TODO**
- Preserve Context
- Model Selection
- Switch URLs
- Error handles
- Typing animation


### LM Studio Installation

`lms` ships with [LM Studio](https://lmstudio.ai/)

To set it up, run the built-in `bootstrap` command like so:

- **Windows**:

  ```shell
  cmd /c %USERPROFILE%/.cache/lm-studio/bin/lms.exe bootstrap
  ```

- **Linux/macOS**:

  ```shell
  ~/.cache/lm-studio/bin/lms bootstrap
  ```

To check if the bootstrapping was successful, run the following in a **👉 new terminal window 👈**:

```shell
lms
```

# Usage

You can use `lms --help` to see a list of all available subcommands.

For details about each subcommand, run `lms <subcommand> --help`.

Here are some frequently used commands:

- `lms status` - To check the status of LM Studio.
- `lms server start` - To start the local API server.
- `lms server stop` - To stop the local API server.
- `lms ls` - To list all downloaded models.
    - `lms ls --detailed` - To list all downloaded models with detailed information.
    - `lms ls --json` - To list all downloaded models in machine-readable JSON format.
- `lms ps` - To list all loaded models available for inferencing.
    - `lms ps --json` - To list all loaded models available for inferencing in machine-readable JSON format.
- `lms load --gpu max` - To load a model with maximum GPU acceleration
    - `lms load <model path> --gpu max -y` - To load a model with maximum GPU acceleration without confirmation
- `lms unload <model identifier>` - To unload a model
    - `lms unload --all` - To unload all models
- `lms create` - To create a new project with LM Studio SDK
- `lms log stream` - To stream logs from LM Studio
