import os
import re
import subprocess
from string import Template

ROOT_PATH = os.path.dirname(__file__)
JAVA_OUT_PATH = os.path.join(ROOT_PATH, '..', 'java')
PROTO_IN_PATH = os.path.join(ROOT_PATH, 'proto', '*.proto')

if __name__ == "__main__":
    subprocess.call('protoc --java_out=%s %s' % (JAVA_OUT_PATH, PROTO_IN_PATH), shell=True)
    print('protoc java_out finish')
