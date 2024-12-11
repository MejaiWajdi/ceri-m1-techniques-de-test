
echo "Starting badge generation"

CHECKSTYLE_URL="https://raw.githubusercontent.com/MejaiWajdi/ceri-m1-techniques-de-test/master/target/checkstyle-result.xml"

if ! curl --output /dev/null --silent --head --fail "$CHECKSTYLE_URL"; then
  echo "Checkstyle result file not found on GitHub!"
  exit 1
fi

ERRORS=$(curl -s "$CHECKSTYLE_URL" | grep -c "<error ")

if [ "$ERRORS" -eq 0 ]; then
  COLOR="green"
  MESSAGE="Passing"
else
  COLOR="red"
  MESSAGE="$ERRORS errors"
fi

curl -s "https://img.shields.io/badge/Checkstyle-$MESSAGE-$COLOR.svg" -o checkstyle-badge.svg

if [ -f checkstyle-badge.svg ]; then
  echo "Badge generated successfully"
else
  echo "Badge generation failed"
  exit 1
fi
