# GitHub Actions & JFrog Artifactory Integration

This directory contains the configuration files for the CI/CD pipeline.

## Files

- `workflows/build-and-deploy.yml` - GitHub Actions workflow for building and deploying
- `maven-settings.xml` - Maven settings for JFrog Artifactory authentication

## Workflow Triggers

The workflow runs on:
- **Pull Request Close**: When a PR is closed (merged or not)
- **Push to main/master**: Direct pushes to the main branch

## Deployment Conditions

Deployment to JFrog Artifactory only occurs when:
- A pull request is merged (`github.event.pull_request.merged == true`)
- Code is pushed directly to main/master branch

## Environment Variables

The workflow uses these environment variables:
- `ARTIFACTORY_URL`: https://mtapptrust.jfrogdev.org/
- `ARTIFACTORY_USERNAME`: From GitHub secrets
- `ARTIFACTORY_PASSWORD`: From GitHub secrets

## Maven Settings

The `maven-settings.xml` file configures:
- JFrog Artifactory server authentication
- Repository URLs for the calc-NumberAdder repository
- Support for both releases and snapshots

## Setup Instructions

1. Add the required secrets to your GitHub repository:
   - Go to Settings → Secrets and variables → Actions
   - Add `ARTIFACTORY_USERNAME` with your Artifactory username
   - Add `ARTIFACTORY_PASSWORD` with your Artifactory password/token

2. Ensure your JFrog Artifactory repository `calc-NumberAdder` exists and is configured for Maven artifacts

3. The workflow will automatically run on the next push or pull request 