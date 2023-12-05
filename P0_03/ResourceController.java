package PO_03;

public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/resources/{id}")
    public Resource getResourceById(@PathVariable Long id) {
        Resource resource = resourceService.getResourceById(id);
        if (resource == null) {
            throw new ResourceNotFoundException("Resource not found with id: " + id);
        }
        return resource;
    }
}
