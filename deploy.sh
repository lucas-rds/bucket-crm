#!/bin/bash

# Decrypt config & key files
# openssl aes-256-cbc -K $encrypted_1437fc144fa9_key -iv $encrypted_1437fc144fa9_iv -in client-secret.json.enc -out client-secret.json -d

# Authorise GCloud SDK
# gcloud auth activate-service-account travis-crm@k-social-crm.iam.gserviceaccount.com --key-file=client-secret.json --project=k-social-crm

# Run Gradle deployment task
