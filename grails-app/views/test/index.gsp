<html>
<head>

</head>
<body>
    <p>Message: ${message}</p>
    <g:each in="${params}" var="param">
        <li>${param.key}: ${param.value}</li>
    </g:each>
</body>
</html>